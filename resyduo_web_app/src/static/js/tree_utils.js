
function walkDom2(start_element, filterClass) {
    var arr = []; // put all elements here
    var loop = function (element) {
        
        do {
            // we can do something with element
            if (element.nodeType == 1) { // do not include text nodes
                if (element.className == filterClass) {
                    arr.push(element);
                }
            }
            if (element.hasChildNodes())
                loop(element.firstChild);
        }
        while (element = element.nextSibling);
    }
    
    //loop(start_element);
    loop(start_element.firstChild); // do not include siblings of start element
    return arr;
}

function list_to_tree(list,root) {
    var map = {}, node, roots = [], i;
    
    for (i = 0; i < list.length; i += 1) {
      map[list[i].id] = i; // initialize the map
      list[i].children = []; // initialize the children
    }
    //console.log('list: ',list)
    //console.log('map: ',map)
    for (i = 0; i < list.length; i += 1) {
      node = list[i];
      if (node.parentId !== root) {
        // if you have dangling branches check that map[node.parentId] exists
        list[map[node.parentId]].children.push(node);
      } else {
        roots.push(node);
      }
    }
    //console.log(roots)
    return roots;
  }

  var mappedTree


function parseCodeSection(sectionId) {
    codeContainer = document.getElementById(sectionId)
    flatTree = getFlatArrTreeCode(codeContainer)
    tree = list_to_tree(flatTree, 'codeSection')
    console.log("TREE", flatTree)
    mappedTree = flatTree.reduce(function(r, e) {
        r[e.id] = e;
        return r;
        }, {});
    console.log("MAPPED TREE :", mappedTree)
    tree = visitTree(tree, generateStatementCode)
    console.log("tree with code:", tree )
}

function visitTree(tree,fn){
    for(i=0; i < tree.length; i++){
        if(tree[i].children.length>0){
            console.log(tree[i].children)
            visitTree(tree[i].children,generateStatementCode)
        }
        else{
            item =fn(tree, tree[i],'codeSection')
            if(item.parentId != 'codeSection'){
                mappedTree[item.parentId].bodyCode = mappedTree[item.parentId].bodyCode +'\n'+ item.fullCode
                tree.pop(tree[i])
                visitTree(tree,generateStatementCode)
                console.log('mappedtree item: ',mappedTree[item.parentId])
            } 
        }
    }
    return tree
}



function getFlatArrTreeCode(codeContainer) {
    codeArr=[]
    let list = []
    codeArr = walkDom2(codeContainer, 'card-body');
    for (i = 0; i < codeArr.length; i++){
        obj = {}
        obj ["id"] = codeArr[i].id
        obj ["parentId"] = codeArr[i].getAttribute("parentCode")
        obj ["statement"] = codeArr[i].getAttribute("stype")
        obj ["bodyCode"] = ""
        obj ["fullCode"] = ""
        list.push(obj)  
    }
    return list
}


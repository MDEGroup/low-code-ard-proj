var curPosition = 0

function setCursorPosition(textArea){
    cursorPosition = textArea.selectionStart
    console.log(cursorPosition)
}

function addStatementToCode(id){
    element = document.getElementById(id)
    console.log('element',element)
    statementCode = generateStatementCode(element)
    codeEditor = document.getElementById('textEditor')
    codeEditorValue = codeEditor.value
    console.log('textEditorValue',codeEditorValue)
    console.log('curPosition',cursorPosition)
    console.log('Substrin1',codeEditorValue.substring(0, cursorPosition))
    console.log('Substrin1',codeEditorValue.substring(cursorPosition, codeEditorValue.length))
    newEditorCode = codeEditorValue.substring(0, cursorPosition) +statementCode+codeEditorValue.substring(cursorPosition, codeEditorValue.length)
    codeEditor.value = newEditorCode
}


function generateStatementCode(item) {
    console.log('generateStatementCode()')
    statement = item.getAttribute("stype")
    switch (statement) {
        case "variable":
            console.log('switch generate statement:' + statement)
            code = getVariableDeclarationCode(item.id)
            console.log(code)
            return code
            //addCodeToParent(tree,item)
        case "if":
            console.log('switch generate statement:' + statement)
            break;
        case "for":
            console.log('switch generate statement:' + statement)
            //item.bodyCode = '{body}'
            return code =getForCode(item)
        case "switch":
            console.log('switch generate statement:' + statement)
            break;
        default:
            console.log('switch DEFAULT statement:' + statement)
            break;
    }
}

function addCodeToParent(tree){
    if(item.parentId!='codeSection'){
        parent.bodyCode = parent.bodyCode + child.fullCode
    }
}

function getVariableDeclarationCode(id) {
    //console.log('getVariableDeclarationCode(element) class:' + element.className)
    element = document.getElementById(id)
    variableType = element.querySelector('#variableType')
    variableId = element.querySelector('#variableId')
    variableValue = element.querySelector('#variableValue')
    code = variableType.value + ' ' + variableId.value + ' ' + '=' + ' ' + variableValue.value + ';'
    //console.log('code' + code)
    //item.fullCode = code
    return code
}

function getForCode(item) {
/*for(i=0; i< item.children.length; i++){
    body = body + '\n' + item.children[i];
}*/
body = // do something here
code = `for (int i = 0; i < 100; i += 2)
        {
        }
        `
        //item.fullCode = code
        return code
}
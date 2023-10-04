

async function generate_recommended_components(labelContainerID){
    console.log("generate_recommended_components()")
    tab1_components_section = document.getElementById("tab1ComponentSection")
    tab1_select_components = document.getElementById("inputGroupSelectComponentTab1")
    tab1_select_components.innerHTML = "<option selected>Select Components</option>"
    console.log(tab1_select_components.className)
    console.log(tab1_components_section.className)
    selected_tags = getLabels(labelContainerID)
    console.log('selected tags:',selected_tags)
    components = await getComponentsByTags(selected_tags)
    console.log('getComponentsByTags() :'+ components)
    for (i=0; i < components.length; i += 1) {
        option = document.createElement('option');
        option.setAttribute('value', components[i]);
        option.appendChild(document.createTextNode(components[i]));
        tab1_select_components.appendChild(option);
    }
    tab1_components_section.className = "row mt-3"
}

async function generate_recommended_libraries(labelContainerId, tabSectionId,selectId){
    console.log("generate_recommended_components()")
    tabSection = document.getElementById(tabSectionId)
    select = document.getElementById(selectId)
    select.innerHTML = "<option selected>Select Components</option>"
    selectedElements = getLabels(labelContainerId)
    libraries = await getLibsByComponents(selectedElements)
    console.log('libraries----'+libraries)
    for (i=0; i < libraries.length; i += 1) {
        option = document.createElement('option');
        option.setAttribute('value', libraries[i]);
        option.appendChild(document.createTextNode(libraries[i]));
        select.appendChild(option);
    }
    tabSection.className = "row mt-3"
}


function addLabel(htmlFor,labelContainerId){
    var input = document.getElementById(htmlFor)
    var value = input.value
    var labelContainer = document.getElementById(labelContainerId)
    var childLabel = document.createElement('button')
    childLabel.className = "btn btn-outline-secondary m-1"
    childLabel.setAttribute('type','button')
    childLabel.setAttribute('id',value)
    textNode = document.createElement('span')
    textNode.innerText = value
    childLabel.appendChild(textNode)
    //childLabel.innerHTML = '<span>'+value+'</span>' 
    closeLabel = document.createElement('span')
    closeLabel.className = 'badge'
    closeLabel.setAttribute('onClick','removeTag(this.parentNode)')
    closeLabel.innerHTML = '&#x2715' 
    childLabel.appendChild(closeLabel)
    labelContainer.appendChild(childLabel)
}



function removeTag(label){
    label.remove()
}

function getLabels(labelContainerID){
    var labelContainer = document.getElementById(labelContainerID)
    labelNodes = labelContainer.childNodes
    labels = []
    for(i=0;  i < labelNodes.length; i++){
        if(labelNodes[i].innerText!= null){
            e = labelNodes[i].childNodes
            labels.push(e[0].innerText)
        }
    }
    console.log('chiavi:'+labels)
    return labels
}


function addLibrariesToCode(labelContainerID){
    libraries = getLabels(labelContainerID)
    console.log('LIbrerie da aggiungere:'+ labels[0])
    console.log('LIbrerie da aggiungere:'+ labels[1])
    var textEditor = document.getElementById('textEditor')
    console.log('testo:'+textEditor.innerHTML)
    includes=""
    for (i=0;  i < libraries.length; i++){
        includes = includes+ libraries[i]+"\n"
    }
    textEditor.value = includes + textEditor.value
}



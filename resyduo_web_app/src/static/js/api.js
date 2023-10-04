
/*

Tag Api Functions

*/

function getAllTag(data){
    return fetch('/api/tag/', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => response.json())
        .catch((error) => {
        console.error('Error:', error);
        });
    }



function getComponentsByTags(data){
    {
        console.log('data:'+data)
        return fetch('/api/component/', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
            })
            .then(response => response.json())
            .catch((error) => {
            console.error('Error:', error);
            });
        }
}


/*

Tag Component Functions

*/

function getAllComponents(){
    return fetch('/api/component/', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => response.json())
        .catch((error) => {
        console.error('Error:', error);
        });
    }




/*

Libs APi Functions

*/


function getLibsByComponents(data){
    console.log('data:'+data)
    return fetch('/api/library/', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
        })
        .then(response => response.json())
        .catch((error) => {
        console.error('Error:', error);
        });
    }

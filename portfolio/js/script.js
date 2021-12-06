console.log('Jersen')


import {
    getData,
    querySelector
} from '/portfolio/js/utilities.js'


//Selectors

const skillset = querySelector('.skills');
const projectlist = querySelector('.project');
const projectContainer = querySelector('.project-container');
const cover = querySelector('.cover');



//generate contact information
getData("contact").then(function (data) {
    let info = data.contact;
    return info.map(function (contact) {

        const item = document.createElement("div");
        item.setAttribute('class', 'me')

        item.innerHTML =
            `
        <div class="image">
            <img src=${contact.imgpath} alt="Jersen">
        </div>
        <div class="info">
            <div class="mee" >
                <p>${contact.about}</p>      
            </div>
            <div class="other-info">
                <p><a target="_blank" href="${contact.linkedin}"><i class="fab fa-linkedin"></i></a></p>
                <p><a target="_blank" href="${contact.facebook}"><i class="fab fa-facebook"></i></a></p>
                <p><a target="_blank" href="${contact.behance}"><i class="fab fa-behance"></i></a></p>
            </div>
            <div class="resume">
                <a href="${contact.resume}"><i class="fa fa-download"></i>  Download Resume  </a>
            </div>
        </div>`;

        cover.appendChild(item);

    })
});

//generate skills 
getData("skills").then(function (data) {
    let skill = data.skills;
    return skill.map(function (skills) {
        const item = document.createElement("div");

        item.innerHTML =
            `
            <img src=${skills.imgpath} alt=${skills.alt}>
        `;
        skillset.appendChild(item);
    })
});

//generate project file
getData("projects").then(function (data) {
    let project = data.projects;
    const titleContainer = document.createElement('div')
    titleContainer.setAttribute('class', 'title-container');
    const title = document.createElement('p');
    title.innerHTML = 'Web Development Projects</i>'

    return project.map(function (projects) {
        const item = document.createElement("div");
        item.setAttribute('class', 'item')
        item.innerHTML =
            `
        <div class="image">
            <img src=${projects.imgpath} alt=${projects.alt}>
        </div>
        <div class="desc">
        <p>${projects.description}</p>
        <a target="_blank" href="${projects.link}">${projects.call}</a> 
        </div>  
        `;
        titleContainer.appendChild(title);
        projectContainer.appendChild(item);
        projectlist.appendChild(titleContainer);
        projectlist.appendChild(projectContainer);
    })
});
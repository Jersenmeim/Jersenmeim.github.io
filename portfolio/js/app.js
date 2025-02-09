import {
  getData,
  querySelector
} from '/portfolio/js/utilities.js'
/*
import {
  getData,
  querySelector
} from '/js/utilities.js'
*/

const main = querySelector('main');
const about = querySelector('#about');
const education = querySelector('#education');
const contact = querySelector('#contact');
const portfolio = querySelector('#portfolio');


fetch('https://jersenmeim.github.io/portfolio/data/info.json')
.then(response => response.json())
.then(data => {

          //Generate a Navigation

          const header = document.createElement("nav")
          header.innerHTML =
          `
       

            <header id="navbar">
              <div class="container">
                <div class="logo">
                <img src="images/logo.png" alt="logo">
                </div>
                <div class="right">
                <input type="checkbox" id="nav-check">
                <label for="nav-check">
                <span></span>
                <span></span>
                <span></span>
                </label>
                <div class="nav-links">
                <div class="center">
                <li><a href=index.html>About</a></li>
                <li><a href=education.html>Education</a></li>
                <li><a href=portfolio.html>Portfolio</a></li>
                <li><a href="/data/Jersen_Meim_Resume.pdf" download>Resume</a></li>
                </div>
                </div>
                </div>
              </div>
            </header>
          `;

          document.body.insertBefore(header, main);


          try{
              //Generate the personal information

              about.innerHTML = 

              `
              ${data.personalinformation.map(item =>`
              <div>
              <p>${item.title}</p>
              <p>${item.description}</p>
              </div>
              <img src=${item.imgpath} alt=${item.alt}>

              `).join('')}
              `;

              //Generate the contacts
              contact.innerHTML = 

            `
              ${data.contacts.map(item =>`
              <div class="other-info">
                <p><a target="_blank" href="${item.email}"><i class="fa fa-google"></i></a></p>
                <p><a target="_blank" href="${item.LinkedIn}"><i class="fa fa-linkedin"></i></a></p>
                <p><a target="_blank" href="${item.Facebook}"><i class="fa fa-facebook"></i></a></p>
                <p><a target="_blank" href="${item.behance}"><i class="fa fa-behance"></i></a></p>
              </div>

              `).join('')}

              
              `;
          }   
          //Generate the Skills
            catch (error) {
                try{     
                  education.innerHTML = `
                      ${data.education.map(item => `
                     
                      <p>Education</p>
                    
                      <ul>
                          <li><a href="https://drive.google.com/file/d/1bTCGN8AnA8Cgj7nsC3bMYotJtlI6DBGb/view?usp=share_link" >${item.ed.degree}</a></li>
                          <li><a href="https://drive.google.com/file/d/1jmy8wg8vjXcv-wXQO0YKu0zpW8t0SBll/view?usp=share_link" >${item.ed.certificates[1]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1D7gJIPY3a8hmStRSmN9YHGEEgdiOkZwf/view?usp=share_link" >${item.ed.certificates[0]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1ExFRoIpnm9ylQbQZBzJ_F4Np7EAdbMJt/view?usp=share_link" >${item.ed.certificates[2]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1nJ7DApvJz4v6yCwUl2_Y5sOkyDTNOSc2/view?usp=share_link" >${item.ed.certificates[3]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1-kZ0mNy2iJAlaNeQ1gSSmAPFBNRJaeCW/view?usp=share_link" >${item.ed.certificates[4]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1DNxTMt4lZrjQnw1phlkGclPZ95xo2Cgk/view?usp=share_link" >${item.ed.certificates[5]}</a></li>
                          <li><a href="https://drive.google.com/file/d/1VxfbCZjLukoRtQeXLeTe7y1ENp-0b_to/view?usp=share_link" >${item.ed.certificates[6]}</a></li>
                          
                      </ul>

                     

                      <p>Technical Skills</p>
                    
                      <ul>
                     
                          <li>${item.technicalSkills.languages[0]}</li>
                          <li>${item.technicalSkills.languages[1]}</li>
                          <li>${item.technicalSkills.languages[2]}</li>
                          <li>${item.technicalSkills.languages[3]}</li>
                          <li>${item.technicalSkills.languages[4]}</li>

                          <li>${item.technicalSkills.tools[0]}</li>
                          <li>${item.technicalSkills.tools[1]}</li>
                          <li>${item.technicalSkills.tools[2]}</li>
                          <li>${item.technicalSkills.tools[3]}</li>
                    
                          <li>${item.technicalSkills.otherSkills[0]}</li>
                          <li>${item.technicalSkills.otherSkills[1]}</li>
                          <li>${item.technicalSkills.otherSkills[2]}</li>
                          <li>${item.technicalSkills.otherSkills[3]}</li>
                          <li>${item.technicalSkills.otherSkills[4]}</li>

                          <p>Soft Skills</p>
                          
                          <li>${item.softSkills[0]}</li>
                          <li>${item.softSkills[1]}</li>
                          <li>${item.softSkills[2]}</li>
                          <li>${item.softSkills[3]}</li>
                          
                      </ul>
  
                      `).join('')
                    }
                  ` ;
            }

            //Generate the Projects
          catch(error){
          
            portfolio.innerHTML =    
                `
                 
                  ${data.projects.map(item =>`
                  <div class="portfolio-item">

                  <img src=${item.imgpath} alt=${item.alt}>
                  <h3>${item.title}</h3>
                  <p>${item.description}.</p>
                  <a href="${item.link}" class="button">${item.call}</a>
                  </div>
                `).join('')}
                `;
              }
            }


          /*

          try {
          about.appendChild(sectionone);
          contact.appendChild(sectionfour);
          } catch (error) {
          try{
          skills.appendChild(sectiontwo);
          }
          catch(error){
          portfolio.appendChild(sectionthree);
          }

          }
          */  
          ;
          })

.catch(error => 
  {
  console.error('Error fetching JSON data: ', error);
  });


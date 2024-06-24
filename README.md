    <div class="container">
        <div id="repo-details">
            <p class="repo-name">Loading...</p>
            <p class="repo-description"></p>
            <div class="stats">
                <p class="stat">Stars: <span id="stars">0</span></p>
                <p class="stat">Forks: <span id="forks">0</span></p>
                <p class="stat">Watchers: <span id="watchers">0</span></p>
            </div>
        </div>
        <p>&nbsp;<img align="center" src="https://github-readme-stats.vercel.app/api?username=aniket-chugh&show_icons=true&locale=en" alt="aniket-chugh" /></p>
    </div>

    <script>
        document.addEventListener("DOMContentLoaded", function() {
            fetch('https://api.github.com/repos/Aniket-Chugh/365-Days-JAVA')
                .then(response => response.json())
                .then(data => {
                    document.querySelector('.repo-name').innerText = data.name;
                    document.querySelector('.repo-description').innerText = data.description;
                    document.getElementById('stars').innerText = data.stargazers_count;
                    document.getElementById('forks').innerText = data.forks_count;
                    document.getElementById('watchers').innerText = data.watchers_count;
                })
                .catch(error => {
                    console.error('Error fetching repository data:', error);
                });
        });
    </script>

    


# DAY 1 --> 

### Taking input in java :
##### here' the demo  :

https://github.com/Aniket-Chugh/taking-input-in-java-/assets/149312276/f2e426d4-1459-4d27-bff5-cb11db73216a

# Dya 2 : 

#### learnt conditional statements and loops in java and solved questions related to it all...

## Resources :

https://www.youtube.com/watch?v=yRpLlJmRo2w&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop



https://www.javatpoint.com/java-tutorial







https://www.youtube.com/@java365days
##### Apni kaksha 

JAVA 
##### From zero to spring boot


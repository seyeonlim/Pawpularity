# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Design justification
My initial plan for the main method was to make multiple if statements to find out if the player's current position is inside a building or not. The map of the game was a 2D array of characters, and I didn't have a showOptions nor a makeChoice method for each class but rather but all the commands inside the if statements, which made my code more procedural. It also made my main class extremely long. However, by making the map of this game a 2D array of Buildings and making each buidlings having their own showOptions and makeChoice methods by overriding, the code became much more compact, object oriented, and easier for other people to understand. 


## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?

As my game was based on the activities the player does in a certain building, the key point of this project was to make each building extend from a Building class and make them have their own showOptions method and makeChoice options. I also made a Mapp class to create a 2D array of buildings, which is the map of this game. Then I positioned each building in this 2D array so that the player could walk around the map and go inside a building they want to go to. By doing so, the character can get a list of options on what they can do and make a choice among those options based on their position on the map.

 - What **new thing(s)** did you learn / figure out in completing this project?

I first learned how to make my program more object-oriented. As I mentioned abouve, my Main class was full of if statements to check if the player was in a certain building or not. Also, my map was a 2D array of characters instead of Buildings. This made my program extremely long and more like a procedural program. Instead of doing so, by overriding common methods like showOptions or makeChoice and making a getCurrentPosition method in Mapp class that returns the player's current position, I could make the program decide which options to display to the user instead of the user's position going through all the if statements. 

I also learned how to use and create ASCII art, which was used to display pictures of a cat dancing, singing, wearing hats, and more. This added a visual element to my text-based game, which I believe made my game more interesting and engaging. 

 - Is there anything that you wish you had **implemented differently**?

 I originally had a TrainingAcademy class, which was to create a dance academy and a vocal academy. My plan was to make a single TrainingAcademy class instead of making two classes, a DanceAcademy class and a VocalAcademy class, as it seemed to make the program more compact. However, although a dance academy and a vocal academy had very similar methods, which was a method for getting a lesson, I had to make separate classes because they had different showOptions and makeChoice methods. The same thing applies to BeautySalon class and Mall class, although they both have methods for purchasing something. I wish I could have combined these classes, but with my current method of overriding showOptions and makeChoice methods, I thought separating them was more feasible. 

 - If you had **unlimited time**, what additional features would you implement?

 I would definitely work on visualizing this game, apart from using ASCII art, as I think it would be great to see the meowdol having various hairstyles and clothes. It would also be interesting to make this game an online game, which allows a player to compete against an actual player of the game instead of an NPC.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?

 Professor Crouser helped me a lot regarding making my program more object-oriented by overriding methods and creating a 2D array of buildings. He also helped me with dealing with invalid user input, both number and character and fixing the error of having to enter the input twice in order to move on to the next step of the game. 

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?

 I would tell myself to focus on writing down a clear pseudocode before starting to write down the program. I would also tell her to remember that my program has to be object-oriented, not procedural. 

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.

 I worked individually.
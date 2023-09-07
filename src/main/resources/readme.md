The purpose of this document is to give a brief overview of my interpretation of the MarsRover kata.

The program has been written in Java, using the IntelliJ IDE and is tested using the Maven framework. I have endeavoured to create as many tests as possible without, rightly or wrongly, going into endless permutations. The tests can be run at a cmd prompt by typing mvn test, followed by enter.

As suggested by Simon when reviewing my initial planning document, I have created a MissionControl class to create the plateau, create a MarsRover vehicle and place it on the plateau having first ensured that another vehicle is not already positioned in the exact same location in the plateau.

Additionally, again at the suggestion of Simon, I have created a Parse interface with the aim of proceeding character by character through the list of planned vehicle movements and ensuring that, at this stage, only L, M and R are used as valid commands. That way, we should not find ourselves in a sticky situation once sending this to the vehicle that is going to perform the prescribed moves.

At the time of submission, the tests worked. I may have missed the odd thing, but I believe the application - as a whole - would require little modification to become fully working and, again, would need little modification if new functionality were to be added on top of what already exists. 
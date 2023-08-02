# TDD Assessment by Incubyte
Problem Statement
Chandrayaan 3 Lunar Craft: Galactic Space Craft Control

# Description
As a scientist at ISRO controlling the latest lunar spacecraft Chandrayaan 3, your task is to develop a program that translates commands sent from Earth into instructions understood by the spacecraft. The spacecraft navigates through the galaxy using galactic coordinates, represented by x, y, z coordinates (x for east or west location, y for north or south location, and z for distance above or below the galactic plane).

# Requirements
You will be given the initial starting point (x, y, z) of the spacecraft and the direction it is facing (N, S, E, W, Up, Down). The spacecraft receives a character array of commands, and you are required to implement the following functionalities:

Move the spacecraft forward/backward (f, b): The spacecraft moves one step forward or backward based on its current direction.
Turn the spacecraft left/right (l, r): The spacecraft rotates 90 degrees to the left or right, changing its facing direction.
Turn the spacecraft up/down (u, d): The spacecraft changes its angle, rotating upwards or downwards.
Note:

The spacecraft’s initial direction (N, S, E, W, Up, Down) represents the reference frame for movement and rotation.
The spacecraft cannot move or rotate diagonally; it can only move in the direction it is currently facing.
Assume that the spacecraft’s movement and rotations are rigid, and it cannot move beyond the galactic boundaries.
Example
Given the starting point (0, 0, 0) following (x, y, z) and initial direction N, the following commands should result in the indicated final position and direction:

Commands: ["f", "r", "u", "b", "l"]
Starting Position: (0, 0, 0)
Initial Direction: N

"f" - (0, 1, 0) - N <br/>
"r" - (0, 1, 0) - E <br/>
"u" - (0, 1, 0) - U <br/>
"b" - (0, 1, -1) - U <br/>
"l" - (0, 1, -1) - W <br/>
Final Position: (0, 1, -1) <br/>

Final Direction: W <br/>

Your task is to design the program that enables Chandrayaan 3 to execute these commands accurately and efficiently in the vast expanse of the galaxy:

# Note
Make sure to take an incremental approach and show it in the commits
Keep your code clean, readable, and modularized
Do not throw exceptions/handle cases for invalid arguments
Things To Keep In Mind
Host your solution on a public GitHub/GitLab repository
Follow best practices for TDD. Watch this video to understand TDD better
Commit your changes frequently to show how your code evolves with every step of TDD
We encourage you to use the programming language and tools you feel most comfortable with
Do not rush, take your time, we want to see your best work!
Send us the link to your repo once you’re happy with what you’ve done
package com.cs.adapter.MediaPlayer;

//Structural Design Pattern
//Real-World Example: Audio Player supporting multiple formats (MP3, MP4, VLC)
/*
Principles Followed:
- Single Responsibility Principle (SRP): Adapter only converts interface, no extra logic.
- Open/Closed Principle (OCP): Existing classes (AdvancedMediaPlayer) are not modified.
- Dependency Inversion Principle (DIP): Client depends on MediaPlayer interface, not concrete classes.

Pros of Adapter Pattern:
1. Allows reusing existing classes with incompatible interfaces.
2. Reduces tight coupling between client and adaptee.
3. Enables flexibility when integrating legacy systems.
4. Can combine multiple adaptees if needed.

Real-World Analogy:
- Power adapter: Converts 220V socket to 110V plug for laptop usage.
- Card reader: Reads multiple card formats but exposes a single USB interface to PC.
*/
public class AdapterPatternDemo {
	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("song.mp3");       // Directly handled
		player.play("movie.vlc");      // Adapter used
		player.play("video.mp4");      // Adapter used
		player.play("track.avi");      // Unsupported
	}
}


/*Interview Q&A:
Q1: What problem does the Adapter solve?
A1: It allows incompatible interfaces to work together without modifying existing classes.

Q2: Difference between Adapter and Decorator?
A2: Adapter converts the interface; Decorator adds new behavior without changing the interface.

Q3: Can Adapter wrap multiple adaptees?
A3: Yes, one adapter can combine multiple adaptees to provide a single target interface.

Q4: When to use Object Adapter vs Class Adapter?
A4: 
- Object Adapter: Uses composition (preferred in Java, supports runtime flexibility).  
- Class Adapter: Uses inheritance (less flexible in Java due to single inheritance limitation).
 */

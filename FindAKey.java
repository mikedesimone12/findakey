import java.util.Scanner;		
import java.util.List;
import java.util.ArrayList;


public class FindAKey
{
	
	
	public static void main(String[] args)
	{
		FindAKey n = new FindAKey();
		
		// INTRODUCTION
		System.out.println("\nWelcome to Find a Key!");
		System.out.println("Will you be entering chords or notes?");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		
			// NOTES
			if(choice.equalsIgnoreCase("notes"))
			{
				
					// major key notes
					String[] KeyofC = {"C", "D", "E", "F", "G", "A", "B"};
					String[] KeyofCsharp = {"C#", "Db", "D#", "Eb", "F", "F#", "Gb", "G#", "Ab", "A#", "Bb", "C"};
					String[] KeyofD = {"D", "E", "F#", "Gb", "G", "A", "B", "C#", "Db"};
					String[] KeyofDsharp = {"D#", "Eb", "F", "G", "G#", "Ab", "A#", "Bb", "C", "D"};
					String[] KeyofE = {"E", "F#", "Gb", "G#", "Ab", "A", "B", "C#", "Db", "D#", "Eb"};
					String[] KeyofF = {"F", "G", "A", "A#", "Bb", "C", "D", "E"};
					String[] KeyofFsharp = {"F#", "Gb", "G#", "Ab" , "A#", "Bb", "B", "C#", "Db", "D#", "Eb", "F"};
					String[] KeyofG = {"G", "A", "B", "C", "D", "E", "F#", "Gb"};
					String[] KeyofGsharp = {"G#", "Ab", "A#", "Bb", "C", "C#", "Db", "D#", "Eb", "F", "G"};
					String[] KeyofA = {"A", "B", "C#", "Db", "D", "E", "F#", "Gb", "G#", "Ab"};
					String[] KeyofAsharp = {"A#", "Bb", "C", "D", "D#", "Eb", "F", "G", "A"};
					String[] KeyofB = {"B", "C#", "Db", "D#", "Eb", "E", "F#", "Gb", "G#", "Ab", "A#", "Bb"};
					
				// minor key chords (this is actually redundant and a waste of memory because
				// a major scale and its relative minor contain the same notes/chords. Ex: G major = E minor.
				// this is just to help the code reader/writer visualize the pattern and formula of minor keys
					String[] KeyofCMinor = {"C", "D", "D#", "Eb", "F", "G", "G#", "Ab", "A#", "Bb"};
					String[] KeyofCsharpMinor = {"C#", "Db", "D#", "Eb", "E", "F#", "Gb", "G#", "Ab", "A", "B"};
					String[] KeyofDMinor = {"D", "E", "F", "G", "A", "A#", "Bb", "C"};
					String[] KeyofDsharpMinor = {"D#", "Eb", "F", "F#", "Gb", "G#", "Ab", "A#", "Bb", "B", "C#", "Db"};
					String[] KeyofEMinor = {"E", "F#", "Gb", "G", "A", "B", "C", "D"};
					String[] KeyofFMinor = {"F", "G", "G#", "Ab", "A#", "Bb", "C", "C#", "Db", "D#", "Eb"};
					String[] KeyofFsharpMinor = {"F#", "Gb", "G#", "Ab" , "A", "B", "C#", "Db", "D#", "Eb", "F"};
					String[] KeyofGMinor = {"G", "A", "A#", "Bb", "C", "D", "D#", "Eb", "F"};
					String[] KeyofGsharpMinor = {"G#", "Ab", "A#", "Bb", "C", "C#", "Db", "D#", "Eb", "F", "G"};
					String[] KeyofAMinor = {"A", "B", "C", "D", "E", "F", "G"};
					String[] KeyofAsharpMinor = {"A#", "Bb", "C", "C#", "Db", "D#", "Eb", "F", "F#", "Gb", "G#", "Ab"};
					String[] KeyofBMinor = {"B", "C#", "Db", "D", "E", "F#", "Gb", "G", "A"};
					
				
				System.out.println("\nType the note (as an uppercase letter) you would like to identify with a specific key, then press enter!");
				System.out.println("If you make a mistake, type \"delete\" to remove the previous note you entered.");
				System.out.println("Note: sharps are denoted with a # and flats are denoted with a b (i.e. C# and Bb).");
				System.out.println("Once you are finished typing all of the notes in your melody, please type \"exit.\"");
				
				List<String> UserNotes = new ArrayList<String>();
				String NextNote;
				
				do
				{
					
					// need to add error checking for anything thats not a note
					System.out.print("\nEnter a note: ");
					NextNote = input.next();
					if(NextNote.equalsIgnoreCase("delete"))
						UserNotes.remove(UserNotes.size() - 1);
					else
						UserNotes.add(NextNote);
					System.out.print("\nYour current notes: ");
					for (String temp : UserNotes)
					{
						if (!temp.equalsIgnoreCase("exit"))
							System.out.print(temp + " ");
					}
				
				}while(!NextNote.equalsIgnoreCase("exit")); 
				
				System.out.println("\n\nPossible keys for your fancy melody:");
				
			
						if (n.CheckKey(KeyofC, UserNotes))
							System.out.println("C Major");
		
						if (n.CheckKey(KeyofCMinor, UserNotes))
							System.out.println("C Minor");
						
						if (n.CheckKey(KeyofCsharp, UserNotes))
							System.out.println("C#/Db Major");
						
						if (n.CheckKey(KeyofCsharpMinor, UserNotes))
							System.out.println("C#/Db Minor");
						
						if (n.CheckKey(KeyofD, UserNotes))
							System.out.println("D Major");
						
						if (n.CheckKey(KeyofDMinor, UserNotes))
							System.out.println("D Minor");
						
						if (n.CheckKey(KeyofDsharp, UserNotes))
							System.out.println("D#/Eb Major");
						
						if (n.CheckKey(KeyofDsharpMinor, UserNotes))
							System.out.println("D#/Eb Minor");
						
						if (n.CheckKey(KeyofE, UserNotes))
							System.out.println("E Major");
						
						if (n.CheckKey(KeyofEMinor, UserNotes))
							System.out.println("E Minor");
						
						if (n.CheckKey(KeyofF, UserNotes))
							System.out.println("F Major");
						
						if (n.CheckKey(KeyofFMinor, UserNotes))
							System.out.println("F Minor");
						
						if (n.CheckKey(KeyofFsharp, UserNotes))
							System.out.println("F#/Gb Major");
						
						if (n.CheckKey(KeyofFsharpMinor, UserNotes))
							System.out.println("F#/Gb Minor");
						
						if (n.CheckKey(KeyofG, UserNotes))
							System.out.println("G Major");
						
						if (n.CheckKey(KeyofGMinor, UserNotes))
							System.out.println("G Minor");
						
						if (n.CheckKey(KeyofGsharp, UserNotes))
							System.out.println("G#/Ab Major");
						
						if (n.CheckKey(KeyofGsharpMinor, UserNotes))
							System.out.println("G#/Ab Minor");
						
						if (n.CheckKey(KeyofA, UserNotes))
							System.out.println("A Major");
						
						if (n.CheckKey(KeyofAMinor, UserNotes))
							System.out.println("A Minor");
						
						if (n.CheckKey(KeyofAsharp, UserNotes))
							System.out.println("A#/Bb Major");
						
						if (n.CheckKey(KeyofAsharpMinor, UserNotes))
							System.out.println("A#/Bb Minor");
						
						if (n.CheckKey(KeyofB, UserNotes))
							System.out.println("B Major");
						
						if (n.CheckKey(KeyofBMinor, UserNotes))
							System.out.println("B Minor");
			
			
			} // end if notes
			
			// CHORDS
			else if (choice.equalsIgnoreCase("chords"))
			{
				
				// major key chords
				String[] KeyofC = {"C", "Dm", "Em", "F", "G", "Am", "Bdim",
									"Cmaj7", "Dm7", "Em7", "Fmaj7", "G7", "Am7", "Bm7b5"};
				String[] KeyofCsharp = {"C#", "Db", "D#m", "Ebm", "Fm", "F#", "Gb", "G#", "Ab", "A#m", "Bbm", "Cdim",
										"C#maj7", "Dbmaj7", "D#m7", "Ebm7", "Fm7", "F#maj7", "Gbmaj7", "G#7", "Ab7", "A#m7", "Bbm7", "Cm7b5"};
				String[] KeyofD = {"D", "Em", "F#m", "Gbm", "G", "A", "Bm", "C#dim", "Dbdim",
								"Dmaj7", "Em7", "F#m7", "Gbm7", "Gmaj7", "A7", "Bm7", "C#m7b5", "Dbm7b5"};
				String[] KeyofDsharp = {"D#", "Eb", "Fm", "Gm", "G#", "Ab", "A#", "Bb", "Cm", "Ddim",
									"D#maj7", "Ebmaj7", "Fm7", "Gm7", "G#maj7", "Abmaj7", "A#7", "Bb7", "Cm7", "Dm7b5"};
				String[] KeyofE = {"E", "F#m", "Gbm", "G#m", "Abm", "A", "B", "C#m", "Dbm", "D#dim", "Ebdim",
								"Emaj7", "F#m7", "Gbm7", "G#m7", "Abm7", "Amaj7", "B7", "C#m7", "Dbm7", "D#dim7", "Ebm7b5"};
				String[] KeyofF = {"F", "Gm", "Am", "A#", "Bb", "C", "Dm", "Edim",
									"Fmaj7", "Gm7", "Am7", "A#maj7", "Bbmaj7", "C7", "Dm7", "Em7b5"};
				String[] KeyofFsharp = {"F#", "Gb", "G#m", "Abm" , "A#m", "Bbm", "B", "C#", "Db", "D#m", "Ebm", "Fdim",
									"F#maj7", "Gbmaj7", "G#m7", "Abm7" , "A#m7", "Bbm7", "Bmaj7", "C#7", "Db7", "D#m7", "Ebm7", "Fm7b5"};
				String[] KeyofG = {"G", "Am", "Bm", "C", "D", "Em", "F#dim", "Gbdim",
									"Gmaj7", "Am7", "Bm7", "Cmaj7", "D7", "Em7", "F#m7b5", "Gbm7b5"};
				String[] KeyofGsharp = {"G#", "Ab", "A#m", "Bbm", "Cm", "C#", "Db", "D#", "Eb", "Fm", "Gdim",
									"G#maj7", "Abmaj7", "A#m7", "Bbm7", "Cm7", "C#maj7", "Dbmaj7", "D#7", "Eb7", "Fm7", "Gm7b5"};
				String[] KeyofA = {"A", "Bm", "C#m", "Dbm", "D", "E", "F#m", "Gbm", "G#dim", "Abdim",
									"Amaj7", "Bm7", "C#m7", "Dbm7", "Dmaj7", "E7", "F#m7", "Gbm7", "G#m7b5", "Abm7b5"};
				String[] KeyofAsharp = {"A#", "Bb", "Cm", "Dm", "D#", "Eb", "F", "Gm", "Adim",
										"A#maj7", "Bbmaj7", "Cm7", "Dm7", "D#maj7", "Ebmaj7", "F7", "Gm7", "Am7b5"};
				String[] KeyofB = {"B", "C#m", "Dbm", "D#m", "Ebm", "E", "F#", "Gb", "G#m", "Abm", "A#dim", "Bbdim",
									"Bmaj7", "C#m7", "Dbm7", "D#m7", "Ebm7", "Emaj7", "F#7", "Gb7", "G#m7", "Abm7", "A#m7b5", "Bbm7b5"};
				
				// minor key chords (this is actually redundant and a waste of memory because
				// a major scale and its relative minor contain the same notes/chords. Ex: G major and E minor.
				// this is just to help the code reader/writer visualize the pattern and formula of minor keys
				String[] KeyofCMinor = {"Cm", "Ddim", "D#", "Eb", "Fm", "Gm", "G#", "Ab", "A#", "Bb",
									"Cm7", "Dm7b5", "D#maj7", "Ebmaj7", "Fm7", "Gm7", "G#maj7", "Abmaj7", "A#7", "Bb7"};
				String[] KeyofCsharpMinor = {"C#m", "Dbm", "D#dim", "Ebdim", "E", "F#m", "Gbm", "G#m", "Abm", "A", "B",
											"C#m7", "Dbm7", "D#m7b5", "Ebm7b5", "Emaj7", "F#m7", "Gbm7", "Gm7", "G#m7", "Abmaj7", "B7"};
				String[] KeyofDMinor = {"Dm", "Edim", "F", "Gm", "Am", "A#", "Bb", "C",
										"Dm7", "Em7b5", "Fmaj7", "Gm7", "Am7", "A#maj7", "Bbmaj7", "C7"};
				String[] KeyofDsharpMinor = {"D#m", "Ebm", "Fdim", "F#", "Gb", "G#m", "Abm", "A#m", "Bbm", "B", "C#", "Db",
										"D#m7", "Ebm7", "Fm7b5", "F#maj7", "Gbmaj7", "G#m7", "Abm7", "A#m7", "Bbm7", "Bmaj7", "C#7", "Db7"};					
				String[] KeyofEMinor = {"Em", "F#dim", "Gbdim", "G", "Am", "Bm", "C", "D",
										"Em7", "F#m7b5", "Gbm7b5", "Gmaj7", "Am7", "Bm7", "Cmaj7", "D7"};						
				String[] KeyofFMinor = {"Fm", "Gdim", "G#", "Ab", "A#m", "Bbm", "Cm", "C#", "Db", "D#", "Eb",
									"Fm7", "Gm7b5", "G#maj7", "Abmaj7", "A#m7", "Bbm7", "Cm7", "C#maj7", "Dbmaj7", "D#7", "Eb7"};
				String[] KeyofFsharpMinor = {"F#m", "Gbm", "G#dim", "Abdim", "A", "Bm", "C#m", "Dbm", "D", "E", 
									"F#m7", "Gbm7", "G#m7b5", "Abm7b5", "Amaj7", "Bm7", "C#m7", "Dbm7", "Dmaj7", "E7"};
				String[] KeyofGMinor = {"Gm", "Adim", "A#", "Bb", "Cm", "Dm", "D#", "Eb", "F",
										"Gm7", "Am7b5", "A#maj7", "Bbmaj7", "Cm7", "Dm7", "D#maj7", "Ebmaj7", "F7"};
				String[] KeyofGsharpMinor = {"G#m", "Abm", "A#dim", "Bbdim", "B", "C#m", "Dbm", "D#m", "Ebm", "E", "F#", "Gb", 
											"G#m7", "Abm7", "A#m7b5", "Bbm7b5", "Bmaj7", "C#m7", "Dbm7", "D#m7", "Ebm7", "Emaj7", "F#7", "Gb7"};
				String[] KeyofAMinor = {"Am", "Bdim", "C", "Dm", "Em", "F", "G", 
									"Am7", "Bm7b5", "Cmaj7", "Dm7", "Em7", "Fmaj7", "G7"};
				String[] KeyofAsharpMinor = {"A#m", "Bbm", "Cdim", "C#", "Db", "D#m", "Ebm", "Fm", "F#", "Gb", "G#", "Ab",
										"A#m7", "Bbm7", "Cm7b5", "C#maj7", "Dbmaj7", "D#m7", "Ebm7", "Fm7", "F#maj7", "Gbmaj7", "G#7", "Ab7"};
				String[] KeyofBMinor = {"Bm", "C#dim", "Dbdim", "D", "Em", "F#m", "Gbm", "G", "A", 
								"Bm7", "C#m7b5", "Dbm7b5", "Dmaj7", "Em7", "F#m7", "Gbm7", "Gmaj7", "A7"};
				
				
				
				System.out.println("\nType the first chord (with an uppercase letter and no spaces) you would like to identify with a specific key, then press enter!");
				System.out.println("If you make a mistake, type \"delete\" to remove the previous chord you entered.");
				System.out.println("Note: sharps are denoted with a # and flats are denoted with a b (i.e. C# and Bb).\n");
				System.out.println("Major chords are denoted by only their root notes. (i.e. D as opposed to Dmaj).");
				System.out.println("Minor chords are denoted as \"m\" (i.e. Dm).");
				System.out.println("Major 7th chords are denoted as \"maj7\" (i.e. Dmaj7).");
				System.out.println("Minor 7th chords are denoted as \"m7\" (i.e. Dm7).");
				System.out.println("Dominant 7 chords are denoted as \"7\" (i.e. D7).");
				System.out.println("Diminished chords are denoted as \"dim\" (i.e. Ddim).");
				System.out.println("Half-diminished 7th chords are denoted as \"m7b5\" (i.e. Dm7b5).\n");
				System.out.println("Additionally, this program will not account for all chord types (i.e. augmented chords, major 9ths, etc.),");
				System.out.println("so please try to break them down to either minor/major 7ths or triad form.\n");
				System.out.println("If you are finished typing all of the chords in your progression, please type \"exit.\"\n");
				
				List<String> UserChords = new ArrayList<String>();
				String NextChord;
				
				do
				{
					
					// need to add error checking for anything thats not a chord
					System.out.print("\nEnter a chord: ");
					NextChord = input.next();
					if(NextChord.equalsIgnoreCase("delete"))
						UserChords.remove(UserChords.size() - 1);
					else
						UserChords.add(NextChord);
					System.out.print("\nYour current chords: ");
					for (String temp : UserChords)
					{
						if (!temp.equalsIgnoreCase("exit"))
							System.out.print(temp + " ");
					}
				
				}while(!NextChord.equalsIgnoreCase("exit")); 
				
				System.out.println("\n\nPossible keys for your fancy chord progression:");
						
						if (n.CheckKey(KeyofC, UserChords))
							System.out.println("C Major");
		
						if (n.CheckKey(KeyofCMinor, UserChords))
							System.out.println("C Minor");
						
						if (n.CheckKey(KeyofCsharp, UserChords))
							System.out.println("C#/Db Major");
						
						if (n.CheckKey(KeyofCsharpMinor, UserChords))
							System.out.println("C#/Db Minor");
						
						if (n.CheckKey(KeyofD, UserChords))
							System.out.println("D Major");
						
						if (n.CheckKey(KeyofDMinor, UserChords))
							System.out.println("D Minor");
						
						if (n.CheckKey(KeyofDsharp, UserChords))
							System.out.println("D#/Eb Major");
						
						if (n.CheckKey(KeyofDsharpMinor, UserChords))
							System.out.println("D#/Eb Minor");
						
						if (n.CheckKey(KeyofE, UserChords))
							System.out.println("E Major");
						
						if (n.CheckKey(KeyofEMinor, UserChords))
							System.out.println("E Minor");
						
						if (n.CheckKey(KeyofF, UserChords))
							System.out.println("F Major");
						
						if (n.CheckKey(KeyofFMinor, UserChords))
							System.out.println("F Minor");
						
						if (n.CheckKey(KeyofFsharp, UserChords))
							System.out.println("F#/Gb Major");
						
						if (n.CheckKey(KeyofFsharpMinor, UserChords))
							System.out.println("F#/Gb Minor");
						
						if (n.CheckKey(KeyofG, UserChords))
							System.out.println("G Major");
						
						if (n.CheckKey(KeyofGMinor, UserChords))
							System.out.println("G Minor");
						
						if (n.CheckKey(KeyofGsharp, UserChords))
							System.out.println("G#/Ab Major");
						
						if (n.CheckKey(KeyofGsharpMinor, UserChords))
							System.out.println("G#/Ab Minor");
						
						if (n.CheckKey(KeyofA, UserChords))
							System.out.println("A Major");
						
						if (n.CheckKey(KeyofAMinor, UserChords))
							System.out.println("A Minor");
						
						if (n.CheckKey(KeyofAsharp, UserChords))
							System.out.println("A#/Bb Major");
						
						if (n.CheckKey(KeyofAsharpMinor, UserChords))
							System.out.println("A#/Bb Minor");
						
						if (n.CheckKey(KeyofB, UserChords))
							System.out.println("B Major");
						
						if (n.CheckKey(KeyofBMinor, UserChords))
							System.out.println("B Minor");
			
				
				
			} // end if chords
			else 
				System.out.println("Woops! That was not a correct choice. Please type \"chords\" or \"notes.\"");
				System.out.println("\nGoodbye!");
	}
	public boolean CheckKey(String[] Key, List<String> User)
	{
		int keycounter = 0;
		int usersize = User.size() - 1;
		for (String keytemp : Key)
		{
			for (String usertemp : User)
			{
				if (usertemp.equals(keytemp))
					keycounter++;	
			}
		}
		if (keycounter == usersize)
			return true;
		else
			return false;	
	}
	
}
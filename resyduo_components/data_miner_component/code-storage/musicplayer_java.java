import java.io.File;


import javax.sound.sampled.AudioSystem;

import javax.sound.sampled.Clip;


public class MusicPlayer implements Runnable{

	public Clip clip;
	private	File file;
	
	public MusicPlayer(String musicFileName){
		file=new File(musicFileName);
		
	}
	public MusicPlayer(File musicFile){
		file=musicFile;
	}
	@Override
	@Deprecated
	public void run() {
		try{

			clip = AudioSystem.getClip();

			clip.open(AudioSystem.getAudioInputStream(file));
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
			
			
			Thread.sleep(clip.getMicrosecondLength()/1000);

		}

		catch(Exception e){
			e.printStackTrace();
		}

		
	}
	public void Pause(){
		clip.stop();
	}
	public void Stop(){
		clip.stop();
		clip.close();
	}
	public void ReStart(){
		clip.start();
	}
	public void Start(){
		new Thread(this).start();
	}
	public void StartAtFirst(){
		try {
			clip.close();
			clip=AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			Start();
		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} 
	}

}

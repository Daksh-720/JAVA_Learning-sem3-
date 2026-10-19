interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking photo.....");
    }
    public void playMusic(){
        System.out.println("Playing Music......");
    }
}

public class exp7A {
    public static void main(String[] args){
        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}

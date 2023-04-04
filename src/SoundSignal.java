public class SoundSignal implements Runnable {
    private SoundMixer soundMixer;
    private Boolean isADD;
    private int[] amplitudes;


    public SoundSignal(SoundMixer soundMixer, Boolean isADD, int[] amplitudes) {
        this.soundMixer = soundMixer;
        this.isADD = isADD;
        this.amplitudes = amplitudes;
    }


    @Override
    public void run() {
        synchronized (soundMixer){
            if(isADD){
                soundMixer.addSignal(amplitudes);
            }else {
                soundMixer.removeSignal(amplitudes);
            }
        }
    }
}

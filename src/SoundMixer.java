public class SoundMixer {

    private int[] currentMixedSignal={0,0,0,0,0,0,0,0,0,0};

    public void addSignal(int[] signal){
        for(int i=0;i<signal.length;i++){
            currentMixedSignal[i]+=signal[i];
        }
    }

    public void removeSignal(int[] signal){
        for(int i=0;i<signal.length;i++){
            currentMixedSignal[i]-=signal[i];
        }
    }

    public int[] getCurrentMixedSignal() {
        return currentMixedSignal;
    }
}

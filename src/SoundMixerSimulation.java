public class SoundMixerSimulation {

    public static void main(String[] args) {
        SoundMixer mixer=new SoundMixer();

        SoundSignal[] signals=new SoundSignal[]{
                new SoundSignal(mixer,true, new int[]{1, 2, 3, 4, 5}),
                new SoundSignal(mixer,false,new int[]{6,7,8,9,10}),
                new SoundSignal(mixer,true,new int[]{11,12,13,14,15})

        };



        Thread[] threads=new Thread[signals.length];

        for(int i=0;i< signals.length;i++){
            threads[i]=new Thread(signals[i]);
            threads[i].start();
        }

        for(Thread t:threads){
            try{
                t.join();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

        System.out.print("[");
        for(int i=0;i<5;i++){
            if(i==4){
                System.out.print(mixer.getCurrentMixedSignal()[i]);
            }else {
                System.out.print(mixer.getCurrentMixedSignal()[i]+", ");
            }
        }
        System.out.println("]");


}
}

try { 
        mediaRecorder.prepare(); 
    } catch (Exception e) {}
    mediaRecorder.start();
    Timer t = new Timer();
    t.schedule(new TimerTask() {
        @Override
        public void run() {
            stopSelf();
        }
    }, 5000);
}catch(Exception e){}

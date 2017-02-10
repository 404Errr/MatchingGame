package main;

public class UpdateLoop implements Runnable {
	private static double speedFactor = 1;

	static void setSpeedFactor(double speedFactor) {
		UpdateLoop.speedFactor = speedFactor;
	}

	@Override
	public void run() {
		System.out.println("UPS: "+Main.UPS);
		final long updateSpeed = 1000000000/Main.UPS;
		long startTime = 0, wait = 0;
		while (Main.RUNNING) {
			startTime = System.nanoTime();

			update();
			Window.renderer.repaint();

			wait = (long)(((updateSpeed/speedFactor)-(System.nanoTime()-startTime))/1000000);
			try {
				if (wait>0) {
					Thread.sleep(wait);
				}
				else {
					System.out.println("LAGGING "+wait);
				}
			}
			catch (Exception e) {
				System.out.println("-UPDATE LOOP ERROR");
				e.printStackTrace();
			}
		}
	}

	private void update() {
		try {
			
		}
		catch (Exception e) {
			System.out.println("-UPDATE ERROR");
			e.printStackTrace();
		}
	}
}

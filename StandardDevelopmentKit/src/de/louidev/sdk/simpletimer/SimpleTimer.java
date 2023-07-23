package de.louidev.sdk.simpletimer;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimer {

	private Timer timer;
	private SimpleTimerAction onCancel;

	private SimpleTimer(Timer timer) {
		this.timer = timer;
		this.onCancel = () -> {
		};
	}

	private SimpleTimer(Timer timer, SimpleTimerAction onCancel) {
		this.timer = timer;
		this.onCancel = onCancel;
	}

	public void cancel() {
		timer.cancel();
		timer.purge();
		onCancel.performAction();
	}

	// DELAY

	public static SimpleTimer delay(long delay, SimpleTimerAction action) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				action.performAction();
			}

		}, delay);
		return new SimpleTimer(timer);
	}

	public static SimpleTimer delay(long delay, SimpleTimerAction action, SimpleTimerAction onCancel) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				action.performAction();
			}

		}, delay);
		return new SimpleTimer(timer, onCancel);
	}

	// REPEAT

	public static SimpleTimer repeat(long period, long delay, SimpleTimerAction action) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				action.performAction();
			}

		}, delay, period);
		return new SimpleTimer(timer);
	}

	public static SimpleTimer repeat(long period, long delay, SimpleTimerAction action, SimpleTimerAction onCancel) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				action.performAction();
			}

		}, delay, period);
		return new SimpleTimer(timer, onCancel);
	}

	// REPEAT FOR

	public static SimpleTimer repeatFor(long period, long delay, int amount, SimpleTimerAction action) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			int x = 0;

			@Override
			public void run() {
				if (x == amount) {
					timer.cancel();
					timer.purge();
				} else {
					action.performAction();
				}
				x++;
			}

		}, delay, period);
		return new SimpleTimer(timer);
	}

	public static SimpleTimer repeatFor(long period, long delay, int amount, SimpleTimerAction action,
			SimpleTimerAction onCancel) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			int x = 0;

			@Override
			public void run() {
				if (x == amount) {
					timer.cancel();
					timer.purge();
				} else {
					action.performAction();
				}
				x++;
			}

		}, delay, period);
		return new SimpleTimer(timer, onCancel);
	}

	public interface SimpleTimerAction {
		void performAction();
	}

}

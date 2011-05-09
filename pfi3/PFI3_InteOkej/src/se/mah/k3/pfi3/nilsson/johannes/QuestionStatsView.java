package se.mah.k3.pfi3.nilsson.johannes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuestionStatsView extends Button {
	
	private int width = 200;
	private final int HEIGHT = 100;
	private final int CIRCLE_RADIUS = 20;
	
	private int numAnswers = 5;
	private int numSupports = 9;
	
	private Paint answersPaint;
	private Paint supportsPaint;
	private Paint innerTextPaint;
	private Paint outerTextPaint;
	
	public QuestionStatsView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setWidth(width);
		setHeight(HEIGHT);
		
		answersPaint = new Paint();
		answersPaint.setARGB(255, 0, 255, 255);
		supportsPaint = new Paint();
		supportsPaint.setARGB(255, 255, 255, 0);
		innerTextPaint = new Paint();
		innerTextPaint.setARGB(255, 255, 255, 255);
		outerTextPaint = new Paint();
		outerTextPaint.setARGB(255, 0, 0, 0);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		width = getWidth();
		canvas.drawARGB(255, 255, 255, 255);
		
		canvas.drawCircle(20, HEIGHT/2, CIRCLE_RADIUS, answersPaint);
		canvas.drawText(Integer.toString(numAnswers), 16, (HEIGHT/2) + 5, innerTextPaint);
		canvas.drawText("Svar", 9, (HEIGHT/2) + 35, outerTextPaint);
		
		canvas.drawCircle(70, HEIGHT/2, CIRCLE_RADIUS, supportsPaint);
		canvas.drawText(Integer.toString(numSupports), 66, (HEIGHT/2) + 5, innerTextPaint);
		canvas.drawText("Stöd", 54, (HEIGHT/2) + 35, outerTextPaint);
		
		super.onDraw(canvas);
	}
	
	public void setValues(int numAnswers, int numSupports)
	{
		this.numAnswers = numAnswers;
		this.numSupports = numSupports;
	}
	

}

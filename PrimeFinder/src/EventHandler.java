import javax.swing.event.*;
public class EventHandler extends AWTEvent {
	  public static final int EVENT_ID = AWTEvent.RESERVED_ID_MAX + 1;
	  private String str;
	  private int percent;

	  EventHandler( Object target, String str, int percent)
	  {
	    super( target, EVENT_ID);
	    this.str = str;
	    this.percent = percent;
	  } 

	  public String getStr() { return( str ); }

	  public int getPercent() { return( percent ); }
	} 

}

import sun.util.calendar.BaseCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void imprimir()
    {
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        Date hour = Calendar.getInstance().getTime();
        String dataFormat = time.format(hour);
        System.out.println(dataFormat + " - Olá " + this.getName() + ", você acabou de fazer seu primeiro Hello World em Java. Parabéns!!!");
    }
}

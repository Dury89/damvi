package fase7;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Redefinici� de la classe ObjectOuputStream per a que no escrigui una cap�alera
 * al comen�ament de l'Stream.
 */
public class MyObjectOutputStream extends ObjectOutputStream
{
    /** Constructor que rep OutputStream */
    public MyObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sense par�metres */
    protected MyObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }

    /** Redefinici� del m�tode d'escriure la cap�alera per a que no faci res. */
    protected void writeStreamHeader() throws IOException
    {
    }

}
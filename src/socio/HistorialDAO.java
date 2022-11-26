package socio;

import java.sql.SQLException;
import java.util.List;
  
public interface HistorialDAO {

    public int add(Historial hist)
        throws SQLException;

    public void delete(int id)
        throws SQLException;

    public Historial getHistorial(int id)
        throws SQLException;

    public List<Historial> getHistoriales()
        throws SQLException;
        
    public void update(Historial hist)
        throws SQLException;
}

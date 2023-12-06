package visao;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import modelo.InfoViagem;

public class clienteJtableModel extends AbstractTableModel{

private ArrayList<Infocliente> lista;
private String[] colunas ={"Id reserva", "Status", "Nome"};

public clienteJtableModel(ArrayList<Infocliente> lista) {
this.lista=lista;
}

@Override
public int getRowCount() {
return this.lista.size();
}

@Override
public int getColumnCount() {
return colunas.length;
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
	Infocliente c = lista.get(rowIndex);
   switch (columnIndex) {
       case 0:
           return c.getIdReserva();
       case 1:
           return c.getStatus();
       case 2:
           return c.getNome();
       default:
           return null;
   }
}

@Override
public String getColumnName(int column) {
return colunas[column];
}

}

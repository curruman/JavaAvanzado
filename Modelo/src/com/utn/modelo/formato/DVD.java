package com.utn.modelo.formato;

import com.utn.modelo.EnumGenero;
import com.utn.modelo.Peliculas;

public class DVD  extends Peliculas{

	public DVD(EnumGenero genero, double precio) {
		super(genero, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipoFormato() {
		// TODO Auto-generated method stub
		return null;
	}

}

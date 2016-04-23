package com.ada.modelo;

public class Operador extends Pessoa {
	
	public static final int admin = 0;
	public static final int usuario = 1;
	
	public Admin ad;
	public Usuario user;
	
	public Operador(int type) {
		switch(type){
            case admin:
                ad = new Admin();
        case usuario:
                user = new Usuario(); 
		}
    }
		
    public Admin getAd() {
        return ad;
    }
    
    public void setAd(Admin ad) {
        this.ad = ad;
    }
    
    public Usuario getUser() {
        return user;
    }
    public void setUsuario(Usuario user) {
        this.user = user;
    }

}

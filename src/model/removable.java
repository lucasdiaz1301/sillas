package model;

public interface removable {
    /**
     * Evalúa si una silla debe ser retirada del catálogo según sus reglas de negocio.
     * 
     * @return true si debe removerse, false si se debe mantener.
     */
    boolean shouldBeRemoved();
}





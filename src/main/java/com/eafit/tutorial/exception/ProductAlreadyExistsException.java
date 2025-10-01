package com.eafit.tutorial.exception;

/**
 * Excepción lanzada cuando se intenta crear un producto que ya existe
 */
public class ProductAlreadyExistsException extends RuntimeException {

    public ProductAlreadyExistsException(String message) {
        super(message);
    }

    public ProductAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor específico para crear la excepción con el nombre del producto
     */
    public static ProductAlreadyExistsException forProductName(String productName) {
        return new ProductAlreadyExistsException("Ya existe un producto con el nombre: " + productName);
    }
}

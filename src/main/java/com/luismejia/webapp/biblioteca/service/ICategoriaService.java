package com.luismejia.webapp.biblioteca.service;

import java.util.List;

import com.luismejia.webapp.biblioteca.model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listarCategorias(Categoria categoria);

    public void guardarCategoria(Categoria categoria);

    public Categoria busCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);

}

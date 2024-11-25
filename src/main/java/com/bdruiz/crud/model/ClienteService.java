package com.bdruiz.crud.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
	ClienteDAO cdao;

    public void inserir(Cliente cli){
        cdao.inserir(cli);
    }

    public List< Map<String,Object>> obterTodosClientes(){
        return cdao.obterTodosClientes();

    }



    public void atualizarClientes(int id, Cliente cli){
        cdao.atualizarCliente(id, cli);
    }

    public Cliente obterCliente(int id){
        return cdao.obterCliente(id);
    }

    public void deletarCliente(int id){
        cdao.deletarCliente(id);

    }

}

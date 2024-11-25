package com.bdruiz.crud.model;

import java.util.Map;

public class Tool {
    public static Cliente converterCliente (Map<String,Object> registro){
        return new Cliente((Integer)registro.get("id"),
                            (String)registro.get("nome"),
                            (String)registro.get("cpf"));


    }
}

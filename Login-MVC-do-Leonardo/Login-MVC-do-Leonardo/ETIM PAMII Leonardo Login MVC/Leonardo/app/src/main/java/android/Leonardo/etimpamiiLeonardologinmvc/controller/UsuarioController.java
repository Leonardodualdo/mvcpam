package android.leonardo.etimpamiileonardologinmvc.controller;

import android.content.ContentValues;
import android.content.Context;
import android.matheus.etimpamiimatheusloginmvc.datamodel.UsuarioDataModel;
import android.matheus.etimpamiimatheusloginmvc.datasource.AppDataBase;
import android.matheus.etimpamiimatheusloginmvc.model.Usuario;

import java.util.Collections;
import java.util.List;

public class UsuarioController extends AppDataBase implements iCrud<Usuario> {
    ContentValues dadosDoObjeto;
    public UsuarioController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Usuario obj) {
        dadosDoObjeto = new ContentValues();
        dadosDoObjeto.put(UsuarioDataModel.NOME, obj.getUserName() );
        dadosDoObjeto.put(UsuarioDataModel.EMAIL, obj.getUserEmail() );
        dadosDoObjeto.put(UsuarioDataModel.SENHA, obj.getUserPassword() );

        return false;
    }

    @Override
    public boolean alterar(Usuario obj) {
        return false;
    }

    @Override
    public boolean deletar(Usuario obj) {
        return false;
    }

    @Override
    public List<Usuario> listar() {
        return Collections.emptyList();
    }
}

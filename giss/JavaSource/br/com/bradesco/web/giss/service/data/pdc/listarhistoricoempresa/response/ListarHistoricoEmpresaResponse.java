/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarHistoricoEmpresaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarHistoricoEmpresaResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaHistoricoEmpresaList
     */
    private java.util.Vector _listaHistoricoEmpresaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarHistoricoEmpresaResponse() 
     {
        super();
        _listaHistoricoEmpresaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaHistoricoEmpresa
     * 
     * 
     * 
     * @param vListaHistoricoEmpresa
     */
    public void addListaHistoricoEmpresa(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa vListaHistoricoEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoEmpresaList.size() < 150)) {
            throw new IndexOutOfBoundsException("addListaHistoricoEmpresa has a maximum of 150");
        }
        _listaHistoricoEmpresaList.addElement(vListaHistoricoEmpresa);
    } //-- void addListaHistoricoEmpresa(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) 

    /**
     * Method addListaHistoricoEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoEmpresa
     */
    public void addListaHistoricoEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa vListaHistoricoEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaHistoricoEmpresaList.size() < 150)) {
            throw new IndexOutOfBoundsException("addListaHistoricoEmpresa has a maximum of 150");
        }
        _listaHistoricoEmpresaList.insertElementAt(vListaHistoricoEmpresa, index);
    } //-- void addListaHistoricoEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaHistoricoEmpresa
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaHistoricoEmpresa()
    {
        return _listaHistoricoEmpresaList.elements();
    } //-- java.util.Enumeration enumerateListaHistoricoEmpresa() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Method getListaHistoricoEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa getListaHistoricoEmpresa(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoEmpresaList.size())) {
            throw new IndexOutOfBoundsException("getListaHistoricoEmpresa: Index value '"+index+"' not in range [0.."+(_listaHistoricoEmpresaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) _listaHistoricoEmpresaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa getListaHistoricoEmpresa(int) 

    /**
     * Method getListaHistoricoEmpresa
     * 
     * 
     * 
     * @return ListaHistoricoEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa[] getListaHistoricoEmpresa()
    {
        int size = _listaHistoricoEmpresaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) _listaHistoricoEmpresaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa[] getListaHistoricoEmpresa() 

    /**
     * Method getListaHistoricoEmpresaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaHistoricoEmpresaCount()
    {
        return _listaHistoricoEmpresaList.size();
    } //-- int getListaHistoricoEmpresaCount() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllListaHistoricoEmpresa
     * 
     */
    public void removeAllListaHistoricoEmpresa()
    {
        _listaHistoricoEmpresaList.removeAllElements();
    } //-- void removeAllListaHistoricoEmpresa() 

    /**
     * Method removeListaHistoricoEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaHistoricoEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa removeListaHistoricoEmpresa(int index)
    {
        java.lang.Object obj = _listaHistoricoEmpresaList.elementAt(index);
        _listaHistoricoEmpresaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa removeListaHistoricoEmpresa(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Method setListaHistoricoEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaHistoricoEmpresa
     */
    public void setListaHistoricoEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa vListaHistoricoEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaHistoricoEmpresaList.size())) {
            throw new IndexOutOfBoundsException("setListaHistoricoEmpresa: Index value '"+index+"' not in range [0.." + (_listaHistoricoEmpresaList.size() - 1) + "]");
        }
        if (!(index < 150)) {
            throw new IndexOutOfBoundsException("setListaHistoricoEmpresa has a maximum of 150");
        }
        _listaHistoricoEmpresaList.setElementAt(vListaHistoricoEmpresa, index);
    } //-- void setListaHistoricoEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) 

    /**
     * Method setListaHistoricoEmpresa
     * 
     * 
     * 
     * @param listaHistoricoEmpresaArray
     */
    public void setListaHistoricoEmpresa(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa[] listaHistoricoEmpresaArray)
    {
        //-- copy array
        _listaHistoricoEmpresaList.removeAllElements();
        for (int i = 0; i < listaHistoricoEmpresaArray.length; i++) {
            _listaHistoricoEmpresaList.addElement(listaHistoricoEmpresaArray[i]);
        }
    } //-- void setListaHistoricoEmpresa(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListaHistoricoEmpresa) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarHistoricoEmpresaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.response.ListarHistoricoEmpresaResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}

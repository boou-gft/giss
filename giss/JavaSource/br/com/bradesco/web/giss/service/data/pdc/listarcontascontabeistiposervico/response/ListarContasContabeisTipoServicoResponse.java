/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response;

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
 * Class ListarContasContabeisTipoServicoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarContasContabeisTipoServicoResponse implements java.io.Serializable {


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
     * Field _numConsulta
     */
    private int _numConsulta = 0;

    /**
     * keeps track of state for field: _numConsulta
     */
    private boolean _has_numConsulta;

    /**
     * Field _listaContaContabilTipoServicoList
     */
    private java.util.Vector _listaContaContabilTipoServicoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarContasContabeisTipoServicoResponse() 
     {
        super();
        _listaContaContabilTipoServicoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaContaContabilTipoServico
     * 
     * 
     * 
     * @param vListaContaContabilTipoServico
     */
    public void addListaContaContabilTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico vListaContaContabilTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContaContabilTipoServicoList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaContaContabilTipoServico has a maximum of 200");
        }
        _listaContaContabilTipoServicoList.addElement(vListaContaContabilTipoServico);
    } //-- void addListaContaContabilTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) 

    /**
     * Method addListaContaContabilTipoServico
     * 
     * 
     * 
     * @param index
     * @param vListaContaContabilTipoServico
     */
    public void addListaContaContabilTipoServico(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico vListaContaContabilTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContaContabilTipoServicoList.size() < 200)) {
            throw new IndexOutOfBoundsException("addListaContaContabilTipoServico has a maximum of 200");
        }
        _listaContaContabilTipoServicoList.insertElementAt(vListaContaContabilTipoServico, index);
    } //-- void addListaContaContabilTipoServico(int, br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) 

    /**
     * Method deleteNumConsulta
     * 
     */
    public void deleteNumConsulta()
    {
        this._has_numConsulta= false;
    } //-- void deleteNumConsulta() 

    /**
     * Method enumerateListaContaContabilTipoServico
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaContaContabilTipoServico()
    {
        return _listaContaContabilTipoServicoList.elements();
    } //-- java.util.Enumeration enumerateListaContaContabilTipoServico() 

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
     * Method getListaContaContabilTipoServico
     * 
     * 
     * 
     * @param index
     * @return ListaContaContabilTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico getListaContaContabilTipoServico(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContaContabilTipoServicoList.size())) {
            throw new IndexOutOfBoundsException("getListaContaContabilTipoServico: Index value '"+index+"' not in range [0.."+(_listaContaContabilTipoServicoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) _listaContaContabilTipoServicoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico getListaContaContabilTipoServico(int) 

    /**
     * Method getListaContaContabilTipoServico
     * 
     * 
     * 
     * @return ListaContaContabilTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico[] getListaContaContabilTipoServico()
    {
        int size = _listaContaContabilTipoServicoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) _listaContaContabilTipoServicoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico[] getListaContaContabilTipoServico() 

    /**
     * Method getListaContaContabilTipoServicoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaContaContabilTipoServicoCount()
    {
        return _listaContaContabilTipoServicoList.size();
    } //-- int getListaContaContabilTipoServicoCount() 

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
     * Returns the value of field 'numConsulta'.
     * 
     * @return int
     * @return the value of field 'numConsulta'.
     */
    public int getNumConsulta()
    {
        return this._numConsulta;
    } //-- int getNumConsulta() 

    /**
     * Method hasNumConsulta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsulta()
    {
        return this._has_numConsulta;
    } //-- boolean hasNumConsulta() 

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
     * Method removeAllListaContaContabilTipoServico
     * 
     */
    public void removeAllListaContaContabilTipoServico()
    {
        _listaContaContabilTipoServicoList.removeAllElements();
    } //-- void removeAllListaContaContabilTipoServico() 

    /**
     * Method removeListaContaContabilTipoServico
     * 
     * 
     * 
     * @param index
     * @return ListaContaContabilTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico removeListaContaContabilTipoServico(int index)
    {
        java.lang.Object obj = _listaContaContabilTipoServicoList.elementAt(index);
        _listaContaContabilTipoServicoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico removeListaContaContabilTipoServico(int) 

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
     * Method setListaContaContabilTipoServico
     * 
     * 
     * 
     * @param index
     * @param vListaContaContabilTipoServico
     */
    public void setListaContaContabilTipoServico(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico vListaContaContabilTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContaContabilTipoServicoList.size())) {
            throw new IndexOutOfBoundsException("setListaContaContabilTipoServico: Index value '"+index+"' not in range [0.." + (_listaContaContabilTipoServicoList.size() - 1) + "]");
        }
        if (!(index < 200)) {
            throw new IndexOutOfBoundsException("setListaContaContabilTipoServico has a maximum of 200");
        }
        _listaContaContabilTipoServicoList.setElementAt(vListaContaContabilTipoServico, index);
    } //-- void setListaContaContabilTipoServico(int, br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) 

    /**
     * Method setListaContaContabilTipoServico
     * 
     * 
     * 
     * @param listaContaContabilTipoServicoArray
     */
    public void setListaContaContabilTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico[] listaContaContabilTipoServicoArray)
    {
        //-- copy array
        _listaContaContabilTipoServicoList.removeAllElements();
        for (int i = 0; i < listaContaContabilTipoServicoArray.length; i++) {
            _listaContaContabilTipoServicoList.addElement(listaContaContabilTipoServicoArray[i]);
        }
    } //-- void setListaContaContabilTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) 

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
     * Sets the value of field 'numConsulta'.
     * 
     * @param numConsulta the value of field 'numConsulta'.
     */
    public void setNumConsulta(int numConsulta)
    {
        this._numConsulta = numConsulta;
        this._has_numConsulta = true;
    } //-- void setNumConsulta(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarContasContabeisTipoServicoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListarContasContabeisTipoServicoResponse unmarshal(java.io.Reader) 

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

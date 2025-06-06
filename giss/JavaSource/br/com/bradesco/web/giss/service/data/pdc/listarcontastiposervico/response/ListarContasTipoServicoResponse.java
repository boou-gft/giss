/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response;

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
 * Class ListarContasTipoServicoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarContasTipoServicoResponse implements java.io.Serializable {


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
     * Field _quantidadeOcorrencia
     */
    private int _quantidadeOcorrencia = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencia
     */
    private boolean _has_quantidadeOcorrencia;

    /**
     * Field _listaContasTipoServicoList
     */
    private java.util.Vector _listaContasTipoServicoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarContasTipoServicoResponse() 
     {
        super();
        _listaContasTipoServicoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaContasTipoServico
     * 
     * 
     * 
     * @param vListaContasTipoServico
     */
    public void addListaContasTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico vListaContasTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContasTipoServicoList.size() < 220)) {
            throw new IndexOutOfBoundsException("addListaContasTipoServico has a maximum of 220");
        }
        _listaContasTipoServicoList.addElement(vListaContasTipoServico);
    } //-- void addListaContasTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) 

    /**
     * Method addListaContasTipoServico
     * 
     * 
     * 
     * @param index
     * @param vListaContasTipoServico
     */
    public void addListaContasTipoServico(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico vListaContasTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaContasTipoServicoList.size() < 220)) {
            throw new IndexOutOfBoundsException("addListaContasTipoServico has a maximum of 220");
        }
        _listaContasTipoServicoList.insertElementAt(vListaContasTipoServico, index);
    } //-- void addListaContasTipoServico(int, br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) 

    /**
     * Method deleteQuantidadeOcorrencia
     * 
     */
    public void deleteQuantidadeOcorrencia()
    {
        this._has_quantidadeOcorrencia= false;
    } //-- void deleteQuantidadeOcorrencia() 

    /**
     * Method enumerateListaContasTipoServico
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaContasTipoServico()
    {
        return _listaContasTipoServicoList.elements();
    } //-- java.util.Enumeration enumerateListaContasTipoServico() 

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
     * Method getListaContasTipoServico
     * 
     * 
     * 
     * @param index
     * @return ListaContasTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico getListaContasTipoServico(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasTipoServicoList.size())) {
            throw new IndexOutOfBoundsException("getListaContasTipoServico: Index value '"+index+"' not in range [0.."+(_listaContasTipoServicoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) _listaContasTipoServicoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico getListaContasTipoServico(int) 

    /**
     * Method getListaContasTipoServico
     * 
     * 
     * 
     * @return ListaContasTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico[] getListaContasTipoServico()
    {
        int size = _listaContasTipoServicoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) _listaContasTipoServicoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico[] getListaContasTipoServico() 

    /**
     * Method getListaContasTipoServicoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaContasTipoServicoCount()
    {
        return _listaContasTipoServicoList.size();
    } //-- int getListaContasTipoServicoCount() 

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
     * Returns the value of field 'quantidadeOcorrencia'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencia'.
     */
    public int getQuantidadeOcorrencia()
    {
        return this._quantidadeOcorrencia;
    } //-- int getQuantidadeOcorrencia() 

    /**
     * Method hasQuantidadeOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencia()
    {
        return this._has_quantidadeOcorrencia;
    } //-- boolean hasQuantidadeOcorrencia() 

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
     * Method removeAllListaContasTipoServico
     * 
     */
    public void removeAllListaContasTipoServico()
    {
        _listaContasTipoServicoList.removeAllElements();
    } //-- void removeAllListaContasTipoServico() 

    /**
     * Method removeListaContasTipoServico
     * 
     * 
     * 
     * @param index
     * @return ListaContasTipoServico
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico removeListaContasTipoServico(int index)
    {
        java.lang.Object obj = _listaContasTipoServicoList.elementAt(index);
        _listaContasTipoServicoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico removeListaContasTipoServico(int) 

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
     * Method setListaContasTipoServico
     * 
     * 
     * 
     * @param index
     * @param vListaContasTipoServico
     */
    public void setListaContasTipoServico(int index, br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico vListaContasTipoServico)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaContasTipoServicoList.size())) {
            throw new IndexOutOfBoundsException("setListaContasTipoServico: Index value '"+index+"' not in range [0.." + (_listaContasTipoServicoList.size() - 1) + "]");
        }
        if (!(index < 220)) {
            throw new IndexOutOfBoundsException("setListaContasTipoServico has a maximum of 220");
        }
        _listaContasTipoServicoList.setElementAt(vListaContasTipoServico, index);
    } //-- void setListaContasTipoServico(int, br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) 

    /**
     * Method setListaContasTipoServico
     * 
     * 
     * 
     * @param listaContasTipoServicoArray
     */
    public void setListaContasTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico[] listaContasTipoServicoArray)
    {
        //-- copy array
        _listaContasTipoServicoList.removeAllElements();
        for (int i = 0; i < listaContasTipoServicoArray.length; i++) {
            _listaContasTipoServicoList.addElement(listaContasTipoServicoArray[i]);
        }
    } //-- void setListaContasTipoServico(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListaContasTipoServico) 

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
     * Sets the value of field 'quantidadeOcorrencia'.
     * 
     * @param quantidadeOcorrencia the value of field
     * 'quantidadeOcorrencia'.
     */
    public void setQuantidadeOcorrencia(int quantidadeOcorrencia)
    {
        this._quantidadeOcorrencia = quantidadeOcorrencia;
        this._has_quantidadeOcorrencia = true;
    } //-- void setQuantidadeOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarContasTipoServicoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.ListarContasTipoServicoResponse unmarshal(java.io.Reader) 

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

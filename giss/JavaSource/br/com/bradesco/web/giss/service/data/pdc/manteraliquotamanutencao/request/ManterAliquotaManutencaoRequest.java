/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request;

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
 * Class ManterAliquotaManutencaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ManterAliquotaManutencaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _indicadorPesquisa
     */
    private java.lang.String _indicadorPesquisa;

    /**
     * Field _tipoTela
     */
    private java.lang.String _tipoTela;

    /**
     * Field _qtdOcorrencia
     */
    private int _qtdOcorrencia = 0;

    /**
     * keeps track of state for field: _qtdOcorrencia
     */
    private boolean _has_qtdOcorrencia;

    /**
     * Field _listaList
     */
    private java.util.Vector _listaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManterAliquotaManutencaoRequest() 
     {
        super();
        _listaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLista
     * 
     * 
     * 
     * @param vLista
     */
    public void addLista(br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 400)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 400");
        }
        _listaList.addElement(vLista);
    } //-- void addLista(br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) 

    /**
     * Method addLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void addLista(int index, br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 400)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 400");
        }
        _listaList.insertElementAt(vLista, index);
    } //-- void addLista(int, br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) 

    /**
     * Method deleteQtdOcorrencia
     * 
     */
    public void deleteQtdOcorrencia()
    {
        this._has_qtdOcorrencia= false;
    } //-- void deleteQtdOcorrencia() 

    /**
     * Method enumerateLista
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLista()
    {
        return _listaList.elements();
    } //-- java.util.Enumeration enumerateLista() 

    /**
     * Returns the value of field 'indicadorPesquisa'.
     * 
     * @return String
     * @return the value of field 'indicadorPesquisa'.
     */
    public java.lang.String getIndicadorPesquisa()
    {
        return this._indicadorPesquisa;
    } //-- java.lang.String getIndicadorPesquisa() 

    /**
     * Method getLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista getLista(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("getLista: Index value '"+index+"' not in range [0.."+(_listaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) _listaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista getLista(int) 

    /**
     * Method getLista
     * 
     * 
     * 
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista[] getLista()
    {
        int size = _listaList.size();
        br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista[] mArray = new br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) _listaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista[] getLista() 

    /**
     * Method getListaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCount()
    {
        return _listaList.size();
    } //-- int getListaCount() 

    /**
     * Returns the value of field 'qtdOcorrencia'.
     * 
     * @return int
     * @return the value of field 'qtdOcorrencia'.
     */
    public int getQtdOcorrencia()
    {
        return this._qtdOcorrencia;
    } //-- int getQtdOcorrencia() 

    /**
     * Returns the value of field 'tipoTela'.
     * 
     * @return String
     * @return the value of field 'tipoTela'.
     */
    public java.lang.String getTipoTela()
    {
        return this._tipoTela;
    } //-- java.lang.String getTipoTela() 

    /**
     * Method hasQtdOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdOcorrencia()
    {
        return this._has_qtdOcorrencia;
    } //-- boolean hasQtdOcorrencia() 

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
     * Method removeAllLista
     * 
     */
    public void removeAllLista()
    {
        _listaList.removeAllElements();
    } //-- void removeAllLista() 

    /**
     * Method removeLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista removeLista(int index)
    {
        java.lang.Object obj = _listaList.elementAt(index);
        _listaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista removeLista(int) 

    /**
     * Sets the value of field 'indicadorPesquisa'.
     * 
     * @param indicadorPesquisa the value of field
     * 'indicadorPesquisa'.
     */
    public void setIndicadorPesquisa(java.lang.String indicadorPesquisa)
    {
        this._indicadorPesquisa = indicadorPesquisa;
    } //-- void setIndicadorPesquisa(java.lang.String) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void setLista(int index, br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("setLista: Index value '"+index+"' not in range [0.." + (_listaList.size() - 1) + "]");
        }
        if (!(index < 400)) {
            throw new IndexOutOfBoundsException("setLista has a maximum of 400");
        }
        _listaList.setElementAt(vLista, index);
    } //-- void setLista(int, br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param listaArray
     */
    public void setLista(br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista[] listaArray)
    {
        //-- copy array
        _listaList.removeAllElements();
        for (int i = 0; i < listaArray.length; i++) {
            _listaList.addElement(listaArray[i]);
        }
    } //-- void setLista(br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.Lista) 

    /**
     * Sets the value of field 'qtdOcorrencia'.
     * 
     * @param qtdOcorrencia the value of field 'qtdOcorrencia'.
     */
    public void setQtdOcorrencia(int qtdOcorrencia)
    {
        this._qtdOcorrencia = qtdOcorrencia;
        this._has_qtdOcorrencia = true;
    } //-- void setQtdOcorrencia(int) 

    /**
     * Sets the value of field 'tipoTela'.
     * 
     * @param tipoTela the value of field 'tipoTela'.
     */
    public void setTipoTela(java.lang.String tipoTela)
    {
        this._tipoTela = tipoTela;
    } //-- void setTipoTela(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ManterAliquotaManutencaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.request.ManterAliquotaManutencaoRequest unmarshal(java.io.Reader) 

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

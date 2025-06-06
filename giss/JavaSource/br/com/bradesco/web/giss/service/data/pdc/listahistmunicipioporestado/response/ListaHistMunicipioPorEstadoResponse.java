/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaHistMunicipioPorEstadoResponse.java,v 1.2 2017/07/25 18:15:11 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response;

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
 * Class ListaHistMunicipioPorEstadoResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/25 18:15:11 $
 */
public class ListaHistMunicipioPorEstadoResponse implements java.io.Serializable {


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
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasHistMunicipioList
     */
    private java.util.Vector _ocorrenciasHistMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaHistMunicipioPorEstadoResponse() 
     {
        super();
        _ocorrenciasHistMunicipioList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param vOcorrenciasHistMunicipio
     */
    public void addOcorrenciasHistMunicipio(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio vOcorrenciasHistMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasHistMunicipioList.size() < 100)) {
            throw new IndexOutOfBoundsException("addOcorrenciasHistMunicipio has a maximum of 100");
        }
        _ocorrenciasHistMunicipioList.addElement(vOcorrenciasHistMunicipio);
    } //-- void addOcorrenciasHistMunicipio(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) 

    /**
     * Method addOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasHistMunicipio
     */
    public void addOcorrenciasHistMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio vOcorrenciasHistMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasHistMunicipioList.size() < 100)) {
            throw new IndexOutOfBoundsException("addOcorrenciasHistMunicipio has a maximum of 100");
        }
        _ocorrenciasHistMunicipioList.insertElementAt(vOcorrenciasHistMunicipio, index);
    } //-- void addOcorrenciasHistMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasHistMunicipio()
    {
        return _ocorrenciasHistMunicipioList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasHistMunicipio() 

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
     * Method getOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasHistMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio getOcorrenciasHistMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasHistMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasHistMunicipio: Index value '"+index+"' not in range [0.."+(_ocorrenciasHistMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) _ocorrenciasHistMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio getOcorrenciasHistMunicipio(int) 

    /**
     * Method getOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @return OcorrenciasHistMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio[] getOcorrenciasHistMunicipio()
    {
        int size = _ocorrenciasHistMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) _ocorrenciasHistMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio[] getOcorrenciasHistMunicipio() 

    /**
     * Method getOcorrenciasHistMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasHistMunicipioCount()
    {
        return _ocorrenciasHistMunicipioList.size();
    } //-- int getOcorrenciasHistMunicipioCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllOcorrenciasHistMunicipio
     * 
     */
    public void removeAllOcorrenciasHistMunicipio()
    {
        _ocorrenciasHistMunicipioList.removeAllElements();
    } //-- void removeAllOcorrenciasHistMunicipio() 

    /**
     * Method removeOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasHistMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio removeOcorrenciasHistMunicipio(int index)
    {
        java.lang.Object obj = _ocorrenciasHistMunicipioList.elementAt(index);
        _ocorrenciasHistMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio removeOcorrenciasHistMunicipio(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasHistMunicipio
     */
    public void setOcorrenciasHistMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio vOcorrenciasHistMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasHistMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasHistMunicipio: Index value '"+index+"' not in range [0.." + (_ocorrenciasHistMunicipioList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setOcorrenciasHistMunicipio has a maximum of 100");
        }
        _ocorrenciasHistMunicipioList.setElementAt(vOcorrenciasHistMunicipio, index);
    } //-- void setOcorrenciasHistMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) 

    /**
     * Method setOcorrenciasHistMunicipio
     * 
     * 
     * 
     * @param ocorrenciasHistMunicipioArray
     */
    public void setOcorrenciasHistMunicipio(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio[] ocorrenciasHistMunicipioArray)
    {
        //-- copy array
        _ocorrenciasHistMunicipioList.removeAllElements();
        for (int i = 0; i < ocorrenciasHistMunicipioArray.length; i++) {
            _ocorrenciasHistMunicipioList.addElement(ocorrenciasHistMunicipioArray[i]);
        }
    } //-- void setOcorrenciasHistMunicipio(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.OcorrenciasHistMunicipio) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaHistMunicipioPorEstadoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.response.ListaHistMunicipioPorEstadoResponse unmarshal(java.io.Reader) 

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

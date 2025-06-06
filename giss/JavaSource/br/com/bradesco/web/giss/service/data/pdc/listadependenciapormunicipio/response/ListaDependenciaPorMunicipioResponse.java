/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response;

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
 * Class ListaDependenciaPorMunicipioResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListaDependenciaPorMunicipioResponse implements java.io.Serializable {


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
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUF
     */
    private java.lang.String _codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasDepPorMunicipioList
     */
    private java.util.Vector _ocorrenciasDepPorMunicipioList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaDependenciaPorMunicipioResponse() 
     {
        super();
        _ocorrenciasDepPorMunicipioList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param vOcorrenciasDepPorMunicipio
     */
    public void addOcorrenciasDepPorMunicipio(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio vOcorrenciasDepPorMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepPorMunicipioList.addElement(vOcorrenciasDepPorMunicipio);
    } //-- void addOcorrenciasDepPorMunicipio(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) 

    /**
     * Method addOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepPorMunicipio
     */
    public void addOcorrenciasDepPorMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio vOcorrenciasDepPorMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepPorMunicipioList.insertElementAt(vOcorrenciasDepPorMunicipio, index);
    } //-- void addOcorrenciasDepPorMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasDepPorMunicipio()
    {
        return _ocorrenciasDepPorMunicipioList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasDepPorMunicipio() 

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
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUF'.
     * 
     * @return String
     * @return the value of field 'codUF'.
     */
    public java.lang.String getCodUF()
    {
        return this._codUF;
    } //-- java.lang.String getCodUF() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

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
     * Method getOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepPorMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio getOcorrenciasDepPorMunicipio(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepPorMunicipioList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasDepPorMunicipio: Index value '"+index+"' not in range [0.."+(_ocorrenciasDepPorMunicipioList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) _ocorrenciasDepPorMunicipioList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio getOcorrenciasDepPorMunicipio(int) 

    /**
     * Method getOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @return OcorrenciasDepPorMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio[] getOcorrenciasDepPorMunicipio()
    {
        int size = _ocorrenciasDepPorMunicipioList.size();
        br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) _ocorrenciasDepPorMunicipioList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio[] getOcorrenciasDepPorMunicipio() 

    /**
     * Method getOcorrenciasDepPorMunicipioCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasDepPorMunicipioCount()
    {
        return _ocorrenciasDepPorMunicipioList.size();
    } //-- int getOcorrenciasDepPorMunicipioCount() 

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
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

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
     * Method removeAllOcorrenciasDepPorMunicipio
     * 
     */
    public void removeAllOcorrenciasDepPorMunicipio()
    {
        _ocorrenciasDepPorMunicipioList.removeAllElements();
    } //-- void removeAllOcorrenciasDepPorMunicipio() 

    /**
     * Method removeOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepPorMunicipio
     */
    public br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio removeOcorrenciasDepPorMunicipio(int index)
    {
        java.lang.Object obj = _ocorrenciasDepPorMunicipioList.elementAt(index);
        _ocorrenciasDepPorMunicipioList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio removeOcorrenciasDepPorMunicipio(int) 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(java.lang.String codUF)
    {
        this._codUF = codUF;
    } //-- void setCodUF(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

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
     * Method setOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepPorMunicipio
     */
    public void setOcorrenciasDepPorMunicipio(int index, br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio vOcorrenciasDepPorMunicipio)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepPorMunicipioList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasDepPorMunicipio: Index value '"+index+"' not in range [0.." + (_ocorrenciasDepPorMunicipioList.size() - 1) + "]");
        }
        _ocorrenciasDepPorMunicipioList.setElementAt(vOcorrenciasDepPorMunicipio, index);
    } //-- void setOcorrenciasDepPorMunicipio(int, br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) 

    /**
     * Method setOcorrenciasDepPorMunicipio
     * 
     * 
     * 
     * @param ocorrenciasDepPorMunicipioArray
     */
    public void setOcorrenciasDepPorMunicipio(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio[] ocorrenciasDepPorMunicipioArray)
    {
        //-- copy array
        _ocorrenciasDepPorMunicipioList.removeAllElements();
        for (int i = 0; i < ocorrenciasDepPorMunicipioArray.length; i++) {
            _ocorrenciasDepPorMunicipioList.addElement(ocorrenciasDepPorMunicipioArray[i]);
        }
    } //-- void setOcorrenciasDepPorMunicipio(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) 

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
     * @return ListaDependenciaPorMunicipioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.ListaDependenciaPorMunicipioResponse unmarshal(java.io.Reader) 

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

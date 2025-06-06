/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response;

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
 * Class CombolistadependenciasResponse.
 * 
 * @version $Revision$ $Date$
 */
public class CombolistadependenciasResponse implements java.io.Serializable {


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
     * Field _cdMunicipio
     */
    private long _cdMunicipio = 0;

    /**
     * keeps track of state for field: _cdMunicipio
     */
    private boolean _has_cdMunicipio;

    /**
     * Field _dcMunicipio
     */
    private java.lang.String _dcMunicipio;

    /**
     * Field _cdUf
     */
    private java.lang.String _cdUf;

    /**
     * Field _dcUf
     */
    private java.lang.String _dcUf;

    /**
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _sQtdAtiva
     */
    private int _sQtdAtiva = 0;

    /**
     * keeps track of state for field: _sQtdAtiva
     */
    private boolean _has_sQtdAtiva;

    /**
     * Field _sQtdEncer
     */
    private int _sQtdEncer = 0;

    /**
     * keeps track of state for field: _sQtdEncer
     */
    private boolean _has_sQtdEncer;

    /**
     * Field _GISSW050CONSULTASSAIDAList
     */
    private java.util.Vector _GISSW050CONSULTASSAIDAList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CombolistadependenciasResponse() 
     {
        super();
        _GISSW050CONSULTASSAIDAList = new Vector();
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param vGISSW050CONSULTASSAIDA
     */
    public void addGISSW050CONSULTASSAIDA(br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA vGISSW050CONSULTASSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        _GISSW050CONSULTASSAIDAList.addElement(vGISSW050CONSULTASSAIDA);
    } //-- void addGISSW050CONSULTASSAIDA(br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) 

    /**
     * Method addGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param index
     * @param vGISSW050CONSULTASSAIDA
     */
    public void addGISSW050CONSULTASSAIDA(int index, br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA vGISSW050CONSULTASSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        _GISSW050CONSULTASSAIDAList.insertElementAt(vGISSW050CONSULTASSAIDA, index);
    } //-- void addGISSW050CONSULTASSAIDA(int, br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) 

    /**
     * Method deleteCdMunicipio
     * 
     */
    public void deleteCdMunicipio()
    {
        this._has_cdMunicipio= false;
    } //-- void deleteCdMunicipio() 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method deleteSQtdAtiva
     * 
     */
    public void deleteSQtdAtiva()
    {
        this._has_sQtdAtiva= false;
    } //-- void deleteSQtdAtiva() 

    /**
     * Method deleteSQtdEncer
     * 
     */
    public void deleteSQtdEncer()
    {
        this._has_sQtdEncer= false;
    } //-- void deleteSQtdEncer() 

    /**
     * Method enumerateGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateGISSW050CONSULTASSAIDA()
    {
        return _GISSW050CONSULTASSAIDAList.elements();
    } //-- java.util.Enumeration enumerateGISSW050CONSULTASSAIDA() 

    /**
     * Returns the value of field 'cdMunicipio'.
     * 
     * @return long
     * @return the value of field 'cdMunicipio'.
     */
    public long getCdMunicipio()
    {
        return this._cdMunicipio;
    } //-- long getCdMunicipio() 

    /**
     * Returns the value of field 'cdUf'.
     * 
     * @return String
     * @return the value of field 'cdUf'.
     */
    public java.lang.String getCdUf()
    {
        return this._cdUf;
    } //-- java.lang.String getCdUf() 

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
     * Returns the value of field 'dcMunicipio'.
     * 
     * @return String
     * @return the value of field 'dcMunicipio'.
     */
    public java.lang.String getDcMunicipio()
    {
        return this._dcMunicipio;
    } //-- java.lang.String getDcMunicipio() 

    /**
     * Returns the value of field 'dcUf'.
     * 
     * @return String
     * @return the value of field 'dcUf'.
     */
    public java.lang.String getDcUf()
    {
        return this._dcUf;
    } //-- java.lang.String getDcUf() 

    /**
     * Method getGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param index
     * @return GISSW050CONSULTASSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA getGISSW050CONSULTASSAIDA(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _GISSW050CONSULTASSAIDAList.size())) {
            throw new IndexOutOfBoundsException("getGISSW050CONSULTASSAIDA: Index value '"+index+"' not in range [0.."+(_GISSW050CONSULTASSAIDAList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) _GISSW050CONSULTASSAIDAList.elementAt(index);
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA getGISSW050CONSULTASSAIDA(int) 

    /**
     * Method getGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @return GISSW050CONSULTASSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA[] getGISSW050CONSULTASSAIDA()
    {
        int size = _GISSW050CONSULTASSAIDAList.size();
        br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA[] mArray = new br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) _GISSW050CONSULTASSAIDAList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA[] getGISSW050CONSULTASSAIDA() 

    /**
     * Method getGISSW050CONSULTASSAIDACount
     * 
     * 
     * 
     * @return int
     */
    public int getGISSW050CONSULTASSAIDACount()
    {
        return _GISSW050CONSULTASSAIDAList.size();
    } //-- int getGISSW050CONSULTASSAIDACount() 

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
     * Returns the value of field 'numConsultas'.
     * 
     * @return int
     * @return the value of field 'numConsultas'.
     */
    public int getNumConsultas()
    {
        return this._numConsultas;
    } //-- int getNumConsultas() 

    /**
     * Returns the value of field 'sQtdAtiva'.
     * 
     * @return int
     * @return the value of field 'sQtdAtiva'.
     */
    public int getSQtdAtiva()
    {
        return this._sQtdAtiva;
    } //-- int getSQtdAtiva() 

    /**
     * Returns the value of field 'sQtdEncer'.
     * 
     * @return int
     * @return the value of field 'sQtdEncer'.
     */
    public int getSQtdEncer()
    {
        return this._sQtdEncer;
    } //-- int getSQtdEncer() 

    /**
     * Method hasCdMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdMunicipio()
    {
        return this._has_cdMunicipio;
    } //-- boolean hasCdMunicipio() 

    /**
     * Method hasNumConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsultas()
    {
        return this._has_numConsultas;
    } //-- boolean hasNumConsultas() 

    /**
     * Method hasSQtdAtiva
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSQtdAtiva()
    {
        return this._has_sQtdAtiva;
    } //-- boolean hasSQtdAtiva() 

    /**
     * Method hasSQtdEncer
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSQtdEncer()
    {
        return this._has_sQtdEncer;
    } //-- boolean hasSQtdEncer() 

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
     * Method removeAllGISSW050CONSULTASSAIDA
     * 
     */
    public void removeAllGISSW050CONSULTASSAIDA()
    {
        _GISSW050CONSULTASSAIDAList.removeAllElements();
    } //-- void removeAllGISSW050CONSULTASSAIDA() 

    /**
     * Method removeGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param index
     * @return GISSW050CONSULTASSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA removeGISSW050CONSULTASSAIDA(int index)
    {
        java.lang.Object obj = _GISSW050CONSULTASSAIDAList.elementAt(index);
        _GISSW050CONSULTASSAIDAList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) obj;
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA removeGISSW050CONSULTASSAIDA(int) 

    /**
     * Sets the value of field 'cdMunicipio'.
     * 
     * @param cdMunicipio the value of field 'cdMunicipio'.
     */
    public void setCdMunicipio(long cdMunicipio)
    {
        this._cdMunicipio = cdMunicipio;
        this._has_cdMunicipio = true;
    } //-- void setCdMunicipio(long) 

    /**
     * Sets the value of field 'cdUf'.
     * 
     * @param cdUf the value of field 'cdUf'.
     */
    public void setCdUf(java.lang.String cdUf)
    {
        this._cdUf = cdUf;
    } //-- void setCdUf(java.lang.String) 

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
     * Sets the value of field 'dcMunicipio'.
     * 
     * @param dcMunicipio the value of field 'dcMunicipio'.
     */
    public void setDcMunicipio(java.lang.String dcMunicipio)
    {
        this._dcMunicipio = dcMunicipio;
    } //-- void setDcMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'dcUf'.
     * 
     * @param dcUf the value of field 'dcUf'.
     */
    public void setDcUf(java.lang.String dcUf)
    {
        this._dcUf = dcUf;
    } //-- void setDcUf(java.lang.String) 

    /**
     * Method setGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param index
     * @param vGISSW050CONSULTASSAIDA
     */
    public void setGISSW050CONSULTASSAIDA(int index, br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA vGISSW050CONSULTASSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _GISSW050CONSULTASSAIDAList.size())) {
            throw new IndexOutOfBoundsException("setGISSW050CONSULTASSAIDA: Index value '"+index+"' not in range [0.." + (_GISSW050CONSULTASSAIDAList.size() - 1) + "]");
        }
        _GISSW050CONSULTASSAIDAList.setElementAt(vGISSW050CONSULTASSAIDA, index);
    } //-- void setGISSW050CONSULTASSAIDA(int, br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) 

    /**
     * Method setGISSW050CONSULTASSAIDA
     * 
     * 
     * 
     * @param GISSW050CONSULTASSAIDAArray
     */
    public void setGISSW050CONSULTASSAIDA(br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA[] GISSW050CONSULTASSAIDAArray)
    {
        //-- copy array
        _GISSW050CONSULTASSAIDAList.removeAllElements();
        for (int i = 0; i < GISSW050CONSULTASSAIDAArray.length; i++) {
            _GISSW050CONSULTASSAIDAList.addElement(GISSW050CONSULTASSAIDAArray[i]);
        }
    } //-- void setGISSW050CONSULTASSAIDA(br.com.bradesco.web.service.data.pdc.combolistadependencias.response.GISSW050CONSULTASSAIDA) 

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
     * Sets the value of field 'numConsultas'.
     * 
     * @param numConsultas the value of field 'numConsultas'.
     */
    public void setNumConsultas(int numConsultas)
    {
        this._numConsultas = numConsultas;
        this._has_numConsultas = true;
    } //-- void setNumConsultas(int) 

    /**
     * Sets the value of field 'sQtdAtiva'.
     * 
     * @param sQtdAtiva the value of field 'sQtdAtiva'.
     */
    public void setSQtdAtiva(int sQtdAtiva)
    {
        this._sQtdAtiva = sQtdAtiva;
        this._has_sQtdAtiva = true;
    } //-- void setSQtdAtiva(int) 

    /**
     * Sets the value of field 'sQtdEncer'.
     * 
     * @param sQtdEncer the value of field 'sQtdEncer'.
     */
    public void setSQtdEncer(int sQtdEncer)
    {
        this._sQtdEncer = sQtdEncer;
        this._has_sQtdEncer = true;
    } //-- void setSQtdEncer(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return CombolistadependenciasResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.response.CombolistadependenciasResponse unmarshal(java.io.Reader) 

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

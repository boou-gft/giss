/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class CombolistadependenciasRequest.
 * 
 * @version $Revision$ $Date$
 */
public class CombolistadependenciasRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorr
     */
    private int _maxOcorr = 0;

    /**
     * keeps track of state for field: _maxOcorr
     */
    private boolean _has_maxOcorr;

    /**
     * Field _cdMun
     */
    private long _cdMun = 0;

    /**
     * keeps track of state for field: _cdMun
     */
    private boolean _has_cdMun;

    /**
     * Field _cdPjurid
     */
    private long _cdPjurid = 0;

    /**
     * keeps track of state for field: _cdPjurid
     */
    private boolean _has_cdPjurid;

    /**
     * Field _cdDependencia
     */
    private int _cdDependencia = 0;

    /**
     * keeps track of state for field: _cdDependencia
     */
    private boolean _has_cdDependencia;

    /**
     * Field _qtdAtiva
     */
    private int _qtdAtiva = 0;

    /**
     * keeps track of state for field: _qtdAtiva
     */
    private boolean _has_qtdAtiva;

    /**
     * Field _qtdEncer
     */
    private int _qtdEncer = 0;

    /**
     * keeps track of state for field: _qtdEncer
     */
    private boolean _has_qtdEncer;


      //----------------/
     //- Constructors -/
    //----------------/

    public CombolistadependenciasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdDependencia
     * 
     */
    public void deleteCdDependencia()
    {
        this._has_cdDependencia= false;
    } //-- void deleteCdDependencia() 

    /**
     * Method deleteCdMun
     * 
     */
    public void deleteCdMun()
    {
        this._has_cdMun= false;
    } //-- void deleteCdMun() 

    /**
     * Method deleteCdPjurid
     * 
     */
    public void deleteCdPjurid()
    {
        this._has_cdPjurid= false;
    } //-- void deleteCdPjurid() 

    /**
     * Method deleteMaxOcorr
     * 
     */
    public void deleteMaxOcorr()
    {
        this._has_maxOcorr= false;
    } //-- void deleteMaxOcorr() 

    /**
     * Method deleteQtdAtiva
     * 
     */
    public void deleteQtdAtiva()
    {
        this._has_qtdAtiva= false;
    } //-- void deleteQtdAtiva() 

    /**
     * Method deleteQtdEncer
     * 
     */
    public void deleteQtdEncer()
    {
        this._has_qtdEncer= false;
    } //-- void deleteQtdEncer() 

    /**
     * Returns the value of field 'cdDependencia'.
     * 
     * @return int
     * @return the value of field 'cdDependencia'.
     */
    public int getCdDependencia()
    {
        return this._cdDependencia;
    } //-- int getCdDependencia() 

    /**
     * Returns the value of field 'cdMun'.
     * 
     * @return long
     * @return the value of field 'cdMun'.
     */
    public long getCdMun()
    {
        return this._cdMun;
    } //-- long getCdMun() 

    /**
     * Returns the value of field 'cdPjurid'.
     * 
     * @return long
     * @return the value of field 'cdPjurid'.
     */
    public long getCdPjurid()
    {
        return this._cdPjurid;
    } //-- long getCdPjurid() 

    /**
     * Returns the value of field 'maxOcorr'.
     * 
     * @return int
     * @return the value of field 'maxOcorr'.
     */
    public int getMaxOcorr()
    {
        return this._maxOcorr;
    } //-- int getMaxOcorr() 

    /**
     * Returns the value of field 'qtdAtiva'.
     * 
     * @return int
     * @return the value of field 'qtdAtiva'.
     */
    public int getQtdAtiva()
    {
        return this._qtdAtiva;
    } //-- int getQtdAtiva() 

    /**
     * Returns the value of field 'qtdEncer'.
     * 
     * @return int
     * @return the value of field 'qtdEncer'.
     */
    public int getQtdEncer()
    {
        return this._qtdEncer;
    } //-- int getQtdEncer() 

    /**
     * Method hasCdDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdDependencia()
    {
        return this._has_cdDependencia;
    } //-- boolean hasCdDependencia() 

    /**
     * Method hasCdMun
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdMun()
    {
        return this._has_cdMun;
    } //-- boolean hasCdMun() 

    /**
     * Method hasCdPjurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdPjurid()
    {
        return this._has_cdPjurid;
    } //-- boolean hasCdPjurid() 

    /**
     * Method hasMaxOcorr
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorr()
    {
        return this._has_maxOcorr;
    } //-- boolean hasMaxOcorr() 

    /**
     * Method hasQtdAtiva
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdAtiva()
    {
        return this._has_qtdAtiva;
    } //-- boolean hasQtdAtiva() 

    /**
     * Method hasQtdEncer
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdEncer()
    {
        return this._has_qtdEncer;
    } //-- boolean hasQtdEncer() 

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
     * Sets the value of field 'cdDependencia'.
     * 
     * @param cdDependencia the value of field 'cdDependencia'.
     */
    public void setCdDependencia(int cdDependencia)
    {
        this._cdDependencia = cdDependencia;
        this._has_cdDependencia = true;
    } //-- void setCdDependencia(int) 

    /**
     * Sets the value of field 'cdMun'.
     * 
     * @param cdMun the value of field 'cdMun'.
     */
    public void setCdMun(long cdMun)
    {
        this._cdMun = cdMun;
        this._has_cdMun = true;
    } //-- void setCdMun(long) 

    /**
     * Sets the value of field 'cdPjurid'.
     * 
     * @param cdPjurid the value of field 'cdPjurid'.
     */
    public void setCdPjurid(long cdPjurid)
    {
        this._cdPjurid = cdPjurid;
        this._has_cdPjurid = true;
    } //-- void setCdPjurid(long) 

    /**
     * Sets the value of field 'maxOcorr'.
     * 
     * @param maxOcorr the value of field 'maxOcorr'.
     */
    public void setMaxOcorr(int maxOcorr)
    {
        this._maxOcorr = maxOcorr;
        this._has_maxOcorr = true;
    } //-- void setMaxOcorr(int) 

    /**
     * Sets the value of field 'qtdAtiva'.
     * 
     * @param qtdAtiva the value of field 'qtdAtiva'.
     */
    public void setQtdAtiva(int qtdAtiva)
    {
        this._qtdAtiva = qtdAtiva;
        this._has_qtdAtiva = true;
    } //-- void setQtdAtiva(int) 

    /**
     * Sets the value of field 'qtdEncer'.
     * 
     * @param qtdEncer the value of field 'qtdEncer'.
     */
    public void setQtdEncer(int qtdEncer)
    {
        this._qtdEncer = qtdEncer;
        this._has_qtdEncer = true;
    } //-- void setQtdEncer(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return CombolistadependenciasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.combolistadependencias.request.CombolistadependenciasRequest unmarshal(java.io.Reader) 

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

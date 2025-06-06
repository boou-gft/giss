/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request;

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
 * Class GerarRelHistTransacoesRequest.
 * 
 * @version $Revision$ $Date$
 */
public class GerarRelHistTransacoesRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _eCompetIni
     */
    private int _eCompetIni = 0;

    /**
     * keeps track of state for field: _eCompetIni
     */
    private boolean _has_eCompetIni;

    /**
     * Field _eCompetFim
     */
    private int _eCompetFim = 0;

    /**
     * keeps track of state for field: _eCompetFim
     */
    private boolean _has_eCompetFim;

    /**
     * Field _eCodEmpresa
     */
    private int _eCodEmpresa = 0;

    /**
     * keeps track of state for field: _eCodEmpresa
     */
    private boolean _has_eCodEmpresa;

    /**
     * Field _eCodMunicip
     */
    private long _eCodMunicip = 0;

    /**
     * keeps track of state for field: _eCodMunicip
     */
    private boolean _has_eCodMunicip;

    /**
     * Field _eFiller
     */
    private java.lang.String _eFiller;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarRelHistTransacoesRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteECodEmpresa
     * 
     */
    public void deleteECodEmpresa()
    {
        this._has_eCodEmpresa= false;
    } //-- void deleteECodEmpresa() 

    /**
     * Method deleteECodMunicip
     * 
     */
    public void deleteECodMunicip()
    {
        this._has_eCodMunicip= false;
    } //-- void deleteECodMunicip() 

    /**
     * Method deleteECompetFim
     * 
     */
    public void deleteECompetFim()
    {
        this._has_eCompetFim= false;
    } //-- void deleteECompetFim() 

    /**
     * Method deleteECompetIni
     * 
     */
    public void deleteECompetIni()
    {
        this._has_eCompetIni= false;
    } //-- void deleteECompetIni() 

    /**
     * Returns the value of field 'eCodEmpresa'.
     * 
     * @return int
     * @return the value of field 'eCodEmpresa'.
     */
    public int getECodEmpresa()
    {
        return this._eCodEmpresa;
    } //-- int getECodEmpresa() 

    /**
     * Returns the value of field 'eCodMunicip'.
     * 
     * @return long
     * @return the value of field 'eCodMunicip'.
     */
    public long getECodMunicip()
    {
        return this._eCodMunicip;
    } //-- long getECodMunicip() 

    /**
     * Returns the value of field 'eCompetFim'.
     * 
     * @return int
     * @return the value of field 'eCompetFim'.
     */
    public int getECompetFim()
    {
        return this._eCompetFim;
    } //-- int getECompetFim() 

    /**
     * Returns the value of field 'eCompetIni'.
     * 
     * @return int
     * @return the value of field 'eCompetIni'.
     */
    public int getECompetIni()
    {
        return this._eCompetIni;
    } //-- int getECompetIni() 

    /**
     * Returns the value of field 'eFiller'.
     * 
     * @return String
     * @return the value of field 'eFiller'.
     */
    public java.lang.String getEFiller()
    {
        return this._eFiller;
    } //-- java.lang.String getEFiller() 

    /**
     * Method hasECodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECodEmpresa()
    {
        return this._has_eCodEmpresa;
    } //-- boolean hasECodEmpresa() 

    /**
     * Method hasECodMunicip
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECodMunicip()
    {
        return this._has_eCodMunicip;
    } //-- boolean hasECodMunicip() 

    /**
     * Method hasECompetFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECompetFim()
    {
        return this._has_eCompetFim;
    } //-- boolean hasECompetFim() 

    /**
     * Method hasECompetIni
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECompetIni()
    {
        return this._has_eCompetIni;
    } //-- boolean hasECompetIni() 

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
     * Sets the value of field 'eCodEmpresa'.
     * 
     * @param eCodEmpresa the value of field 'eCodEmpresa'.
     */
    public void setECodEmpresa(int eCodEmpresa)
    {
        this._eCodEmpresa = eCodEmpresa;
        this._has_eCodEmpresa = true;
    } //-- void setECodEmpresa(int) 

    /**
     * Sets the value of field 'eCodMunicip'.
     * 
     * @param eCodMunicip the value of field 'eCodMunicip'.
     */
    public void setECodMunicip(long eCodMunicip)
    {
        this._eCodMunicip = eCodMunicip;
        this._has_eCodMunicip = true;
    } //-- void setECodMunicip(long) 

    /**
     * Sets the value of field 'eCompetFim'.
     * 
     * @param eCompetFim the value of field 'eCompetFim'.
     */
    public void setECompetFim(int eCompetFim)
    {
        this._eCompetFim = eCompetFim;
        this._has_eCompetFim = true;
    } //-- void setECompetFim(int) 

    /**
     * Sets the value of field 'eCompetIni'.
     * 
     * @param eCompetIni the value of field 'eCompetIni'.
     */
    public void setECompetIni(int eCompetIni)
    {
        this._eCompetIni = eCompetIni;
        this._has_eCompetIni = true;
    } //-- void setECompetIni(int) 

    /**
     * Sets the value of field 'eFiller'.
     * 
     * @param eFiller the value of field 'eFiller'.
     */
    public void setEFiller(java.lang.String eFiller)
    {
        this._eFiller = eFiller;
    } //-- void setEFiller(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarRelHistTransacoesRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.request.GerarRelHistTransacoesRequest unmarshal(java.io.Reader) 

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

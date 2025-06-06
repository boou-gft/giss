/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request;

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
 * Class ManterAliquotaListaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ManterAliquotaListaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anoMesInicio
     */
    private int _anoMesInicio = 0;

    /**
     * keeps track of state for field: _anoMesInicio
     */
    private boolean _has_anoMesInicio;

    /**
     * Field _anoMesFim
     */
    private int _anoMesFim = 0;

    /**
     * keeps track of state for field: _anoMesFim
     */
    private boolean _has_anoMesFim;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoItemServico
     */
    private int _codigoItemServico = 0;

    /**
     * keeps track of state for field: _codigoItemServico
     */
    private boolean _has_codigoItemServico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManterAliquotaListaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMesFim
     * 
     */
    public void deleteAnoMesFim()
    {
        this._has_anoMesFim= false;
    } //-- void deleteAnoMesFim() 

    /**
     * Method deleteAnoMesInicio
     * 
     */
    public void deleteAnoMesInicio()
    {
        this._has_anoMesInicio= false;
    } //-- void deleteAnoMesInicio() 

    /**
     * Method deleteCodigoItemServico
     * 
     */
    public void deleteCodigoItemServico()
    {
        this._has_codigoItemServico= false;
    } //-- void deleteCodigoItemServico() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'anoMesFim'.
     * 
     * @return int
     * @return the value of field 'anoMesFim'.
     */
    public int getAnoMesFim()
    {
        return this._anoMesFim;
    } //-- int getAnoMesFim() 

    /**
     * Returns the value of field 'anoMesInicio'.
     * 
     * @return int
     * @return the value of field 'anoMesInicio'.
     */
    public int getAnoMesInicio()
    {
        return this._anoMesInicio;
    } //-- int getAnoMesInicio() 

    /**
     * Returns the value of field 'codigoItemServico'.
     * 
     * @return int
     * @return the value of field 'codigoItemServico'.
     */
    public int getCodigoItemServico()
    {
        return this._codigoItemServico;
    } //-- int getCodigoItemServico() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Method hasAnoMesFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesFim()
    {
        return this._has_anoMesFim;
    } //-- boolean hasAnoMesFim() 

    /**
     * Method hasAnoMesInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesInicio()
    {
        return this._has_anoMesInicio;
    } //-- boolean hasAnoMesInicio() 

    /**
     * Method hasCodigoItemServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoItemServico()
    {
        return this._has_codigoItemServico;
    } //-- boolean hasCodigoItemServico() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'anoMesFim'.
     * 
     * @param anoMesFim the value of field 'anoMesFim'.
     */
    public void setAnoMesFim(int anoMesFim)
    {
        this._anoMesFim = anoMesFim;
        this._has_anoMesFim = true;
    } //-- void setAnoMesFim(int) 

    /**
     * Sets the value of field 'anoMesInicio'.
     * 
     * @param anoMesInicio the value of field 'anoMesInicio'.
     */
    public void setAnoMesInicio(int anoMesInicio)
    {
        this._anoMesInicio = anoMesInicio;
        this._has_anoMesInicio = true;
    } //-- void setAnoMesInicio(int) 

    /**
     * Sets the value of field 'codigoItemServico'.
     * 
     * @param codigoItemServico the value of field
     * 'codigoItemServico'.
     */
    public void setCodigoItemServico(int codigoItemServico)
    {
        this._codigoItemServico = codigoItemServico;
        this._has_codigoItemServico = true;
    } //-- void setCodigoItemServico(int) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ManterAliquotaListaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.request.ManterAliquotaListaRequest unmarshal(java.io.Reader) 

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

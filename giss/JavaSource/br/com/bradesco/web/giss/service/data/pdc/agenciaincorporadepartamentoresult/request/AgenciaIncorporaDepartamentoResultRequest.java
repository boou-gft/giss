/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AgenciaIncorporaDepartamentoResultRequest.java,v 1.1 2017/04/11 14:12:24 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request;

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
 * Class AgenciaIncorporaDepartamentoResultRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:24 $
 */
public class AgenciaIncorporaDepartamentoResultRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencia
     */
    private int _numeroMaximoOcorrencia = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencia
     */
    private boolean _has_numeroMaximoOcorrencia;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequenciaUnidadeOrganizacional
     */
    private int _numeroSequenciaUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequenciaUnidadeOrganizacional
     */
    private boolean _has_numeroSequenciaUnidadeOrganizacional;

    /**
     * Field _mesAnoApuracaoContabil
     */
    private int _mesAnoApuracaoContabil = 0;

    /**
     * keeps track of state for field: _mesAnoApuracaoContabil
     */
    private boolean _has_mesAnoApuracaoContabil;


      //----------------/
     //- Constructors -/
    //----------------/

    public AgenciaIncorporaDepartamentoResultRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteMesAnoApuracaoContabil
     * 
     */
    public void deleteMesAnoApuracaoContabil()
    {
        this._has_mesAnoApuracaoContabil= false;
    } //-- void deleteMesAnoApuracaoContabil() 

    /**
     * Method deleteNumeroMaximoOcorrencia
     * 
     */
    public void deleteNumeroMaximoOcorrencia()
    {
        this._has_numeroMaximoOcorrencia= false;
    } //-- void deleteNumeroMaximoOcorrencia() 

    /**
     * Method deleteNumeroSequenciaUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequenciaUnidadeOrganizacional()
    {
        this._has_numeroSequenciaUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'mesAnoApuracaoContabil'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracaoContabil'.
     */
    public int getMesAnoApuracaoContabil()
    {
        return this._mesAnoApuracaoContabil;
    } //-- int getMesAnoApuracaoContabil() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencia'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencia'.
     */
    public int getNumeroMaximoOcorrencia()
    {
        return this._numeroMaximoOcorrencia;
    } //-- int getNumeroMaximoOcorrencia() 

    /**
     * Returns the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     */
    public int getNumeroSequenciaUnidadeOrganizacional()
    {
        return this._numeroSequenciaUnidadeOrganizacional;
    } //-- int getNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasMesAnoApuracaoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracaoContabil()
    {
        return this._has_mesAnoApuracaoContabil;
    } //-- boolean hasMesAnoApuracaoContabil() 

    /**
     * Method hasNumeroMaximoOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencia()
    {
        return this._has_numeroMaximoOcorrencia;
    } //-- boolean hasNumeroMaximoOcorrencia() 

    /**
     * Method hasNumeroSequenciaUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequenciaUnidadeOrganizacional()
    {
        return this._has_numeroSequenciaUnidadeOrganizacional;
    } //-- boolean hasNumeroSequenciaUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'mesAnoApuracaoContabil'.
     * 
     * @param mesAnoApuracaoContabil the value of field
     * 'mesAnoApuracaoContabil'.
     */
    public void setMesAnoApuracaoContabil(int mesAnoApuracaoContabil)
    {
        this._mesAnoApuracaoContabil = mesAnoApuracaoContabil;
        this._has_mesAnoApuracaoContabil = true;
    } //-- void setMesAnoApuracaoContabil(int) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencia'.
     * 
     * @param numeroMaximoOcorrencia the value of field
     * 'numeroMaximoOcorrencia'.
     */
    public void setNumeroMaximoOcorrencia(int numeroMaximoOcorrencia)
    {
        this._numeroMaximoOcorrencia = numeroMaximoOcorrencia;
        this._has_numeroMaximoOcorrencia = true;
    } //-- void setNumeroMaximoOcorrencia(int) 

    /**
     * Sets the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @param numeroSequenciaUnidadeOrganizacional the value of
     * field 'numeroSequenciaUnidadeOrganizacional'.
     */
    public void setNumeroSequenciaUnidadeOrganizacional(int numeroSequenciaUnidadeOrganizacional)
    {
        this._numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
        this._has_numeroSequenciaUnidadeOrganizacional = true;
    } //-- void setNumeroSequenciaUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AgenciaIncorporaDepartamentoResultRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.request.AgenciaIncorporaDepartamentoResultRequest unmarshal(java.io.Reader) 

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

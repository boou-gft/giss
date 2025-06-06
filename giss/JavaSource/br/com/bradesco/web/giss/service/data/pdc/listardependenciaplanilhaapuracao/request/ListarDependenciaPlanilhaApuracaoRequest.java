/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request;

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
 * Class ListarDependenciaPlanilhaApuracaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDependenciaPlanilhaApuracaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _quantidadeOcorrencia
     */
    private int _quantidadeOcorrencia = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencia
     */
    private boolean _has_quantidadeOcorrencia;

    /**
     * Field _dataCompetenciaInicio
     */
    private int _dataCompetenciaInicio = 0;

    /**
     * keeps track of state for field: _dataCompetenciaInicio
     */
    private boolean _has_dataCompetenciaInicio;

    /**
     * Field _dataCompetenciaFim
     */
    private int _dataCompetenciaFim = 0;

    /**
     * keeps track of state for field: _dataCompetenciaFim
     */
    private boolean _has_dataCompetenciaFim;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciaPlanilhaApuracaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteDataCompetenciaFim
     * 
     */
    public void deleteDataCompetenciaFim()
    {
        this._has_dataCompetenciaFim= false;
    } //-- void deleteDataCompetenciaFim() 

    /**
     * Method deleteDataCompetenciaInicio
     * 
     */
    public void deleteDataCompetenciaInicio()
    {
        this._has_dataCompetenciaInicio= false;
    } //-- void deleteDataCompetenciaInicio() 

    /**
     * Method deleteQuantidadeOcorrencia
     * 
     */
    public void deleteQuantidadeOcorrencia()
    {
        this._has_quantidadeOcorrencia= false;
    } //-- void deleteQuantidadeOcorrencia() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

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
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'dataCompetenciaFim'.
     * 
     * @return int
     * @return the value of field 'dataCompetenciaFim'.
     */
    public int getDataCompetenciaFim()
    {
        return this._dataCompetenciaFim;
    } //-- int getDataCompetenciaFim() 

    /**
     * Returns the value of field 'dataCompetenciaInicio'.
     * 
     * @return int
     * @return the value of field 'dataCompetenciaInicio'.
     */
    public int getDataCompetenciaInicio()
    {
        return this._dataCompetenciaInicio;
    } //-- int getDataCompetenciaInicio() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

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
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasDataCompetenciaFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataCompetenciaFim()
    {
        return this._has_dataCompetenciaFim;
    } //-- boolean hasDataCompetenciaFim() 

    /**
     * Method hasDataCompetenciaInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDataCompetenciaInicio()
    {
        return this._has_dataCompetenciaInicio;
    } //-- boolean hasDataCompetenciaInicio() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

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
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'dataCompetenciaFim'.
     * 
     * @param dataCompetenciaFim the value of field
     * 'dataCompetenciaFim'.
     */
    public void setDataCompetenciaFim(int dataCompetenciaFim)
    {
        this._dataCompetenciaFim = dataCompetenciaFim;
        this._has_dataCompetenciaFim = true;
    } //-- void setDataCompetenciaFim(int) 

    /**
     * Sets the value of field 'dataCompetenciaInicio'.
     * 
     * @param dataCompetenciaInicio the value of field
     * 'dataCompetenciaInicio'.
     */
    public void setDataCompetenciaInicio(int dataCompetenciaInicio)
    {
        this._dataCompetenciaInicio = dataCompetenciaInicio;
        this._has_dataCompetenciaInicio = true;
    } //-- void setDataCompetenciaInicio(int) 

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
     * @return ListarDependenciaPlanilhaApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.request.ListarDependenciaPlanilhaApuracaoRequest unmarshal(java.io.Reader) 

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

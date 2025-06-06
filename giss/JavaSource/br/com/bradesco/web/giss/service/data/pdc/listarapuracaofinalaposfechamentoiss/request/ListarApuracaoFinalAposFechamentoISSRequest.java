/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request;

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
 * Class ListarApuracaoFinalAposFechamentoISSRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarApuracaoFinalAposFechamentoISSRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencias
     */
    private int _numeroMaximoOcorrencias = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencias
     */
    private boolean _has_numeroMaximoOcorrencias;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _sequenciaUnidadeOrganiza
     */
    private int _sequenciaUnidadeOrganiza = 0;

    /**
     * keeps track of state for field: _sequenciaUnidadeOrganiza
     */
    private boolean _has_sequenciaUnidadeOrganiza;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoFinalAposFechamentoISSRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest()


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
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteNumeroMaximoOcorrencias
     * 
     */
    public void deleteNumeroMaximoOcorrencias()
    {
        this._has_numeroMaximoOcorrencias= false;
    } //-- void deleteNumeroMaximoOcorrencias() 

    /**
     * Method deleteSequenciaUnidadeOrganiza
     * 
     */
    public void deleteSequenciaUnidadeOrganiza()
    {
        this._has_sequenciaUnidadeOrganiza= false;
    } //-- void deleteSequenciaUnidadeOrganiza() 

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
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencias'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencias'.
     */
    public int getNumeroMaximoOcorrencias()
    {
        return this._numeroMaximoOcorrencias;
    } //-- int getNumeroMaximoOcorrencias() 

    /**
     * Returns the value of field 'sequenciaUnidadeOrganiza'.
     * 
     * @return int
     * @return the value of field 'sequenciaUnidadeOrganiza'.
     */
    public int getSequenciaUnidadeOrganiza()
    {
        return this._sequenciaUnidadeOrganiza;
    } //-- int getSequenciaUnidadeOrganiza() 

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
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

    /**
     * Method hasNumeroMaximoOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencias()
    {
        return this._has_numeroMaximoOcorrencias;
    } //-- boolean hasNumeroMaximoOcorrencias() 

    /**
     * Method hasSequenciaUnidadeOrganiza
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSequenciaUnidadeOrganiza()
    {
        return this._has_sequenciaUnidadeOrganiza;
    } //-- boolean hasSequenciaUnidadeOrganiza() 

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
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencias'.
     * 
     * @param numeroMaximoOcorrencias the value of field
     * 'numeroMaximoOcorrencias'.
     */
    public void setNumeroMaximoOcorrencias(int numeroMaximoOcorrencias)
    {
        this._numeroMaximoOcorrencias = numeroMaximoOcorrencias;
        this._has_numeroMaximoOcorrencias = true;
    } //-- void setNumeroMaximoOcorrencias(int) 

    /**
     * Sets the value of field 'sequenciaUnidadeOrganiza'.
     * 
     * @param sequenciaUnidadeOrganiza the value of field
     * 'sequenciaUnidadeOrganiza'.
     */
    public void setSequenciaUnidadeOrganiza(int sequenciaUnidadeOrganiza)
    {
        this._sequenciaUnidadeOrganiza = sequenciaUnidadeOrganiza;
        this._has_sequenciaUnidadeOrganiza = true;
    } //-- void setSequenciaUnidadeOrganiza(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoFinalAposFechamentoISSRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.request.ListarApuracaoFinalAposFechamentoISSRequest unmarshal(java.io.Reader) 

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

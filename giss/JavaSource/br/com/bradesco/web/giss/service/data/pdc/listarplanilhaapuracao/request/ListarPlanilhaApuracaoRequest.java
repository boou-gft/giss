/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request;

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
 * Class ListarPlanilhaApuracaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPlanilhaApuracaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codPessoaJurid
     */
    private long _codPessoaJurid = 0;

    /**
     * keeps track of state for field: _codPessoaJurid
     */
    private boolean _has_codPessoaJurid;

    /**
     * Field _numSeqUnidOrganiz
     */
    private int _numSeqUnidOrganiz = 0;

    /**
     * keeps track of state for field: _numSeqUnidOrganiz
     */
    private boolean _has_numSeqUnidOrganiz;

    /**
     * Field _filtroConta
     */
    private java.lang.String _filtroConta;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPlanilhaApuracaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodPessoaJurid
     * 
     */
    public void deleteCodPessoaJurid()
    {
        this._has_codPessoaJurid= false;
    } //-- void deleteCodPessoaJurid() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNumSeqUnidOrganiz
     * 
     */
    public void deleteNumSeqUnidOrganiz()
    {
        this._has_numSeqUnidOrganiz= false;
    } //-- void deleteNumSeqUnidOrganiz() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Returns the value of field 'codPessoaJurid'.
     * 
     * @return long
     * @return the value of field 'codPessoaJurid'.
     */
    public long getCodPessoaJurid()
    {
        return this._codPessoaJurid;
    } //-- long getCodPessoaJurid() 

    /**
     * Returns the value of field 'filtroConta'.
     * 
     * @return String
     * @return the value of field 'filtroConta'.
     */
    public java.lang.String getFiltroConta()
    {
        return this._filtroConta;
    } //-- java.lang.String getFiltroConta() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field 'numSeqUnidOrganiz'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidOrganiz'.
     */
    public int getNumSeqUnidOrganiz()
    {
        return this._numSeqUnidOrganiz;
    } //-- int getNumSeqUnidOrganiz() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Method hasCodPessoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJurid()
    {
        return this._has_codPessoaJurid;
    } //-- boolean hasCodPessoaJurid() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasNumSeqUnidOrganiz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidOrganiz()
    {
        return this._has_numSeqUnidOrganiz;
    } //-- boolean hasNumSeqUnidOrganiz() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Sets the value of field 'codPessoaJurid'.
     * 
     * @param codPessoaJurid the value of field 'codPessoaJurid'.
     */
    public void setCodPessoaJurid(long codPessoaJurid)
    {
        this._codPessoaJurid = codPessoaJurid;
        this._has_codPessoaJurid = true;
    } //-- void setCodPessoaJurid(long) 

    /**
     * Sets the value of field 'filtroConta'.
     * 
     * @param filtroConta the value of field 'filtroConta'.
     */
    public void setFiltroConta(java.lang.String filtroConta)
    {
        this._filtroConta = filtroConta;
    } //-- void setFiltroConta(java.lang.String) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field 'numSeqUnidOrganiz'.
     * 
     * @param numSeqUnidOrganiz the value of field
     * 'numSeqUnidOrganiz'.
     */
    public void setNumSeqUnidOrganiz(int numSeqUnidOrganiz)
    {
        this._numSeqUnidOrganiz = numSeqUnidOrganiz;
        this._has_numSeqUnidOrganiz = true;
    } //-- void setNumSeqUnidOrganiz(int) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPlanilhaApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.request.ListarPlanilhaApuracaoRequest unmarshal(java.io.Reader) 

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

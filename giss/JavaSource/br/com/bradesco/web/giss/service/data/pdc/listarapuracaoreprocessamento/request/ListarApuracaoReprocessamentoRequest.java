/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoReprocessamentoRequest.java,v 1.1 2017/04/11 14:08:46 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request;

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
 * Class ListarApuracaoReprocessamentoRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:46 $
 */
public class ListarApuracaoReprocessamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nroMaxOcorrencias
     */
    private int _nroMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _nroMaxOcorrencias
     */
    private boolean _has_nroMaxOcorrencias;

    /**
     * Field _nroSolicitacao
     */
    private int _nroSolicitacao = 0;

    /**
     * keeps track of state for field: _nroSolicitacao
     */
    private boolean _has_nroSolicitacao;

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _nroSeqUndOrganizadora
     */
    private int _nroSeqUndOrganizadora = 0;

    /**
     * keeps track of state for field: _nroSeqUndOrganizadora
     */
    private boolean _has_nroSeqUndOrganizadora;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoReprocessamentoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNroMaxOcorrencias
     * 
     */
    public void deleteNroMaxOcorrencias()
    {
        this._has_nroMaxOcorrencias= false;
    } //-- void deleteNroMaxOcorrencias() 

    /**
     * Method deleteNroSeqUndOrganizadora
     * 
     */
    public void deleteNroSeqUndOrganizadora()
    {
        this._has_nroSeqUndOrganizadora= false;
    } //-- void deleteNroSeqUndOrganizadora() 

    /**
     * Method deleteNroSolicitacao
     * 
     */
    public void deleteNroSolicitacao()
    {
        this._has_nroSolicitacao= false;
    } //-- void deleteNroSolicitacao() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

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
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

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
     * Returns the value of field 'nroMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'nroMaxOcorrencias'.
     */
    public int getNroMaxOcorrencias()
    {
        return this._nroMaxOcorrencias;
    } //-- int getNroMaxOcorrencias() 

    /**
     * Returns the value of field 'nroSeqUndOrganizadora'.
     * 
     * @return int
     * @return the value of field 'nroSeqUndOrganizadora'.
     */
    public int getNroSeqUndOrganizadora()
    {
        return this._nroSeqUndOrganizadora;
    } //-- int getNroSeqUndOrganizadora() 

    /**
     * Returns the value of field 'nroSolicitacao'.
     * 
     * @return int
     * @return the value of field 'nroSolicitacao'.
     */
    public int getNroSolicitacao()
    {
        return this._nroSolicitacao;
    } //-- int getNroSolicitacao() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

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
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

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
     * Method hasNroMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroMaxOcorrencias()
    {
        return this._has_nroMaxOcorrencias;
    } //-- boolean hasNroMaxOcorrencias() 

    /**
     * Method hasNroSeqUndOrganizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSeqUndOrganizadora()
    {
        return this._has_nroSeqUndOrganizadora;
    } //-- boolean hasNroSeqUndOrganizadora() 

    /**
     * Method hasNroSolicitacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSolicitacao()
    {
        return this._has_nroSolicitacao;
    } //-- boolean hasNroSolicitacao() 

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
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

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
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

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
     * Sets the value of field 'nroMaxOcorrencias'.
     * 
     * @param nroMaxOcorrencias the value of field
     * 'nroMaxOcorrencias'.
     */
    public void setNroMaxOcorrencias(int nroMaxOcorrencias)
    {
        this._nroMaxOcorrencias = nroMaxOcorrencias;
        this._has_nroMaxOcorrencias = true;
    } //-- void setNroMaxOcorrencias(int) 

    /**
     * Sets the value of field 'nroSeqUndOrganizadora'.
     * 
     * @param nroSeqUndOrganizadora the value of field
     * 'nroSeqUndOrganizadora'.
     */
    public void setNroSeqUndOrganizadora(int nroSeqUndOrganizadora)
    {
        this._nroSeqUndOrganizadora = nroSeqUndOrganizadora;
        this._has_nroSeqUndOrganizadora = true;
    } //-- void setNroSeqUndOrganizadora(int) 

    /**
     * Sets the value of field 'nroSolicitacao'.
     * 
     * @param nroSolicitacao the value of field 'nroSolicitacao'.
     */
    public void setNroSolicitacao(int nroSolicitacao)
    {
        this._nroSolicitacao = nroSolicitacao;
        this._has_nroSolicitacao = true;
    } //-- void setNroSolicitacao(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoReprocessamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.request.ListarApuracaoReprocessamentoRequest unmarshal(java.io.Reader) 

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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class AlterarMunicipioISSRequest.
 * 
 * @version $Revision$ $Date$
 */
public class AlterarMunicipioISSRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _aliquotaPadrao
     */
    private java.math.BigDecimal _aliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _diaVencimento
     */
    private int _diaVencimento = 0;

    /**
     * keeps track of state for field: _diaVencimento
     */
    private boolean _has_diaVencimento;

    /**
     * Field _indicadorDiaUtil
     */
    private java.lang.String _indicadorDiaUtil;

    /**
     * Field _regraDiaNaoUtil
     */
    private java.lang.String _regraDiaNaoUtil;

    /**
     * Field _codIndPagamento
     */
    private java.lang.String _codIndPagamento;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;

    /**
     * Field _funcao
     */
    private java.lang.String _funcao;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarMunicipioISSRequest() 
     {
        super();
        setAliquotaPadrao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteDiaVencimento
     * 
     */
    public void deleteDiaVencimento()
    {
        this._has_diaVencimento= false;
    } //-- void deleteDiaVencimento() 

    /**
     * Returns the value of field 'aliquotaPadrao'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaPadrao'.
     */
    public java.math.BigDecimal getAliquotaPadrao()
    {
        return this._aliquotaPadrao;
    } //-- java.math.BigDecimal getAliquotaPadrao() 

    /**
     * Returns the value of field 'codIndPagamento'.
     * 
     * @return String
     * @return the value of field 'codIndPagamento'.
     */
    public java.lang.String getCodIndPagamento()
    {
        return this._codIndPagamento;
    } //-- java.lang.String getCodIndPagamento() 

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
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Returns the value of field 'diaVencimento'.
     * 
     * @return int
     * @return the value of field 'diaVencimento'.
     */
    public int getDiaVencimento()
    {
        return this._diaVencimento;
    } //-- int getDiaVencimento() 

    /**
     * Returns the value of field 'funcao'.
     * 
     * @return String
     * @return the value of field 'funcao'.
     */
    public java.lang.String getFuncao()
    {
        return this._funcao;
    } //-- java.lang.String getFuncao() 

    /**
     * Returns the value of field 'indicadorDiaUtil'.
     * 
     * @return String
     * @return the value of field 'indicadorDiaUtil'.
     */
    public java.lang.String getIndicadorDiaUtil()
    {
        return this._indicadorDiaUtil;
    } //-- java.lang.String getIndicadorDiaUtil() 

    /**
     * Returns the value of field 'regraDiaNaoUtil'.
     * 
     * @return String
     * @return the value of field 'regraDiaNaoUtil'.
     */
    public java.lang.String getRegraDiaNaoUtil()
    {
        return this._regraDiaNaoUtil;
    } //-- java.lang.String getRegraDiaNaoUtil() 

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
     * Method hasDiaVencimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimento()
    {
        return this._has_diaVencimento;
    } //-- boolean hasDiaVencimento() 

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
     * Sets the value of field 'aliquotaPadrao'.
     * 
     * @param aliquotaPadrao the value of field 'aliquotaPadrao'.
     */
    public void setAliquotaPadrao(java.math.BigDecimal aliquotaPadrao)
    {
        this._aliquotaPadrao = aliquotaPadrao;
    } //-- void setAliquotaPadrao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codIndPagamento'.
     * 
     * @param codIndPagamento the value of field 'codIndPagamento'.
     */
    public void setCodIndPagamento(java.lang.String codIndPagamento)
    {
        this._codIndPagamento = codIndPagamento;
    } //-- void setCodIndPagamento(java.lang.String) 

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
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Sets the value of field 'diaVencimento'.
     * 
     * @param diaVencimento the value of field 'diaVencimento'.
     */
    public void setDiaVencimento(int diaVencimento)
    {
        this._diaVencimento = diaVencimento;
        this._has_diaVencimento = true;
    } //-- void setDiaVencimento(int) 

    /**
     * Sets the value of field 'funcao'.
     * 
     * @param funcao the value of field 'funcao'.
     */
    public void setFuncao(java.lang.String funcao)
    {
        this._funcao = funcao;
    } //-- void setFuncao(java.lang.String) 

    /**
     * Sets the value of field 'indicadorDiaUtil'.
     * 
     * @param indicadorDiaUtil the value of field 'indicadorDiaUtil'
     */
    public void setIndicadorDiaUtil(java.lang.String indicadorDiaUtil)
    {
        this._indicadorDiaUtil = indicadorDiaUtil;
    } //-- void setIndicadorDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'regraDiaNaoUtil'.
     * 
     * @param regraDiaNaoUtil the value of field 'regraDiaNaoUtil'.
     */
    public void setRegraDiaNaoUtil(java.lang.String regraDiaNaoUtil)
    {
        this._regraDiaNaoUtil = regraDiaNaoUtil;
    } //-- void setRegraDiaNaoUtil(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlterarMunicipioISSRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.request.AlterarMunicipioISSRequest unmarshal(java.io.Reader) 

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

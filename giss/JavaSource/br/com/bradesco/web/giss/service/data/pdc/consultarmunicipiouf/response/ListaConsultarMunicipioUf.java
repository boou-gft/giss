/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response;

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
 * Class ListaConsultarMunicipioUf.
 * 
 * @version $Revision$ $Date$
 */
public class ListaConsultarMunicipioUf implements java.io.Serializable {


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
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUp
     */
    private int _codUp = 0;

    /**
     * keeps track of state for field: _codUp
     */
    private boolean _has_codUp;

    /**
     * Field _siglaUf
     */
    private java.lang.String _siglaUf;

    /**
     * Field _codBanco
     */
    private int _codBanco = 0;

    /**
     * keeps track of state for field: _codBanco
     */
    private boolean _has_codBanco;

    /**
     * Field _codAgencia
     */
    private int _codAgencia = 0;

    /**
     * keeps track of state for field: _codAgencia
     */
    private boolean _has_codAgencia;

    /**
     * Field _conta
     */
    private long _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _dgConta
     */
    private java.lang.String _dgConta;

    /**
     * Field _cnpj
     */
    private long _cnpj = 0;

    /**
     * keeps track of state for field: _cnpj
     */
    private boolean _has_cnpj;

    /**
     * Field _cnpjFilial
     */
    private int _cnpjFilial = 0;

    /**
     * keeps track of state for field: _cnpjFilial
     */
    private boolean _has_cnpjFilial;

    /**
     * Field _cnpjControle
     */
    private int _cnpjControle = 0;

    /**
     * keeps track of state for field: _cnpjControle
     */
    private boolean _has_cnpjControle;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");

    /**
     * Field _diaRecolhimento
     */
    private int _diaRecolhimento = 0;

    /**
     * keeps track of state for field: _diaRecolhimento
     */
    private boolean _has_diaRecolhimento;

    /**
     * Field _indicadorDiaUtil
     */
    private java.lang.String _indicadorDiaUtil;

    /**
     * Field _regraDiaUtil
     */
    private java.lang.String _regraDiaUtil;

    /**
     * Field _statusMunicipio
     */
    private java.lang.String _statusMunicipio;

    /**
     * Field _codIndPagamento
     */
    private java.lang.String _codIndPagamento;

    /**
     * Field _dataHoraManutencao
     */
    private java.lang.String _dataHoraManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultarMunicipioUf() 
     {
        super();
        setAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCnpj
     * 
     */
    public void deleteCnpj()
    {
        this._has_cnpj= false;
    } //-- void deleteCnpj() 

    /**
     * Method deleteCnpjControle
     * 
     */
    public void deleteCnpjControle()
    {
        this._has_cnpjControle= false;
    } //-- void deleteCnpjControle() 

    /**
     * Method deleteCnpjFilial
     * 
     */
    public void deleteCnpjFilial()
    {
        this._has_cnpjFilial= false;
    } //-- void deleteCnpjFilial() 

    /**
     * Method deleteCodAgencia
     * 
     */
    public void deleteCodAgencia()
    {
        this._has_codAgencia= false;
    } //-- void deleteCodAgencia() 

    /**
     * Method deleteCodBanco
     * 
     */
    public void deleteCodBanco()
    {
        this._has_codBanco= false;
    } //-- void deleteCodBanco() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUp
     * 
     */
    public void deleteCodUp()
    {
        this._has_codUp= false;
    } //-- void deleteCodUp() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteDiaRecolhimento
     * 
     */
    public void deleteDiaRecolhimento()
    {
        this._has_diaRecolhimento= false;
    } //-- void deleteDiaRecolhimento() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquota'.
     */
    public java.math.BigDecimal getAliquota()
    {
        return this._aliquota;
    } //-- java.math.BigDecimal getAliquota() 

    /**
     * Returns the value of field 'cnpj'.
     * 
     * @return long
     * @return the value of field 'cnpj'.
     */
    public long getCnpj()
    {
        return this._cnpj;
    } //-- long getCnpj() 

    /**
     * Returns the value of field 'cnpjControle'.
     * 
     * @return int
     * @return the value of field 'cnpjControle'.
     */
    public int getCnpjControle()
    {
        return this._cnpjControle;
    } //-- int getCnpjControle() 

    /**
     * Returns the value of field 'cnpjFilial'.
     * 
     * @return int
     * @return the value of field 'cnpjFilial'.
     */
    public int getCnpjFilial()
    {
        return this._cnpjFilial;
    } //-- int getCnpjFilial() 

    /**
     * Returns the value of field 'codAgencia'.
     * 
     * @return int
     * @return the value of field 'codAgencia'.
     */
    public int getCodAgencia()
    {
        return this._codAgencia;
    } //-- int getCodAgencia() 

    /**
     * Returns the value of field 'codBanco'.
     * 
     * @return int
     * @return the value of field 'codBanco'.
     */
    public int getCodBanco()
    {
        return this._codBanco;
    } //-- int getCodBanco() 

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
     * Returns the value of field 'codUp'.
     * 
     * @return int
     * @return the value of field 'codUp'.
     */
    public int getCodUp()
    {
        return this._codUp;
    } //-- int getCodUp() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return long
     * @return the value of field 'conta'.
     */
    public long getConta()
    {
        return this._conta;
    } //-- long getConta() 

    /**
     * Returns the value of field 'dataHoraManutencao'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencao'.
     */
    public java.lang.String getDataHoraManutencao()
    {
        return this._dataHoraManutencao;
    } //-- java.lang.String getDataHoraManutencao() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'dgConta'.
     * 
     * @return String
     * @return the value of field 'dgConta'.
     */
    public java.lang.String getDgConta()
    {
        return this._dgConta;
    } //-- java.lang.String getDgConta() 

    /**
     * Returns the value of field 'diaRecolhimento'.
     * 
     * @return int
     * @return the value of field 'diaRecolhimento'.
     */
    public int getDiaRecolhimento()
    {
        return this._diaRecolhimento;
    } //-- int getDiaRecolhimento() 

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
     * Returns the value of field 'regraDiaUtil'.
     * 
     * @return String
     * @return the value of field 'regraDiaUtil'.
     */
    public java.lang.String getRegraDiaUtil()
    {
        return this._regraDiaUtil;
    } //-- java.lang.String getRegraDiaUtil() 

    /**
     * Returns the value of field 'siglaUf'.
     * 
     * @return String
     * @return the value of field 'siglaUf'.
     */
    public java.lang.String getSiglaUf()
    {
        return this._siglaUf;
    } //-- java.lang.String getSiglaUf() 

    /**
     * Returns the value of field 'statusMunicipio'.
     * 
     * @return String
     * @return the value of field 'statusMunicipio'.
     */
    public java.lang.String getStatusMunicipio()
    {
        return this._statusMunicipio;
    } //-- java.lang.String getStatusMunicipio() 

    /**
     * Method hasCnpj
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpj()
    {
        return this._has_cnpj;
    } //-- boolean hasCnpj() 

    /**
     * Method hasCnpjControle
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControle()
    {
        return this._has_cnpjControle;
    } //-- boolean hasCnpjControle() 

    /**
     * Method hasCnpjFilial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilial()
    {
        return this._has_cnpjFilial;
    } //-- boolean hasCnpjFilial() 

    /**
     * Method hasCodAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodAgencia()
    {
        return this._has_codAgencia;
    } //-- boolean hasCodAgencia() 

    /**
     * Method hasCodBanco
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodBanco()
    {
        return this._has_codBanco;
    } //-- boolean hasCodBanco() 

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
     * Method hasCodUp
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUp()
    {
        return this._has_codUp;
    } //-- boolean hasCodUp() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasDiaRecolhimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaRecolhimento()
    {
        return this._has_diaRecolhimento;
    } //-- boolean hasDiaRecolhimento() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(java.math.BigDecimal aliquota)
    {
        this._aliquota = aliquota;
    } //-- void setAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'cnpj'.
     * 
     * @param cnpj the value of field 'cnpj'.
     */
    public void setCnpj(long cnpj)
    {
        this._cnpj = cnpj;
        this._has_cnpj = true;
    } //-- void setCnpj(long) 

    /**
     * Sets the value of field 'cnpjControle'.
     * 
     * @param cnpjControle the value of field 'cnpjControle'.
     */
    public void setCnpjControle(int cnpjControle)
    {
        this._cnpjControle = cnpjControle;
        this._has_cnpjControle = true;
    } //-- void setCnpjControle(int) 

    /**
     * Sets the value of field 'cnpjFilial'.
     * 
     * @param cnpjFilial the value of field 'cnpjFilial'.
     */
    public void setCnpjFilial(int cnpjFilial)
    {
        this._cnpjFilial = cnpjFilial;
        this._has_cnpjFilial = true;
    } //-- void setCnpjFilial(int) 

    /**
     * Sets the value of field 'codAgencia'.
     * 
     * @param codAgencia the value of field 'codAgencia'.
     */
    public void setCodAgencia(int codAgencia)
    {
        this._codAgencia = codAgencia;
        this._has_codAgencia = true;
    } //-- void setCodAgencia(int) 

    /**
     * Sets the value of field 'codBanco'.
     * 
     * @param codBanco the value of field 'codBanco'.
     */
    public void setCodBanco(int codBanco)
    {
        this._codBanco = codBanco;
        this._has_codBanco = true;
    } //-- void setCodBanco(int) 

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
     * Sets the value of field 'codUp'.
     * 
     * @param codUp the value of field 'codUp'.
     */
    public void setCodUp(int codUp)
    {
        this._codUp = codUp;
        this._has_codUp = true;
    } //-- void setCodUp(int) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(long conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(long) 

    /**
     * Sets the value of field 'dataHoraManutencao'.
     * 
     * @param dataHoraManutencao the value of field
     * 'dataHoraManutencao'.
     */
    public void setDataHoraManutencao(java.lang.String dataHoraManutencao)
    {
        this._dataHoraManutencao = dataHoraManutencao;
    } //-- void setDataHoraManutencao(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'dgConta'.
     * 
     * @param dgConta the value of field 'dgConta'.
     */
    public void setDgConta(java.lang.String dgConta)
    {
        this._dgConta = dgConta;
    } //-- void setDgConta(java.lang.String) 

    /**
     * Sets the value of field 'diaRecolhimento'.
     * 
     * @param diaRecolhimento the value of field 'diaRecolhimento'.
     */
    public void setDiaRecolhimento(int diaRecolhimento)
    {
        this._diaRecolhimento = diaRecolhimento;
        this._has_diaRecolhimento = true;
    } //-- void setDiaRecolhimento(int) 

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
     * Sets the value of field 'regraDiaUtil'.
     * 
     * @param regraDiaUtil the value of field 'regraDiaUtil'.
     */
    public void setRegraDiaUtil(java.lang.String regraDiaUtil)
    {
        this._regraDiaUtil = regraDiaUtil;
    } //-- void setRegraDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'siglaUf'.
     * 
     * @param siglaUf the value of field 'siglaUf'.
     */
    public void setSiglaUf(java.lang.String siglaUf)
    {
        this._siglaUf = siglaUf;
    } //-- void setSiglaUf(java.lang.String) 

    /**
     * Sets the value of field 'statusMunicipio'.
     * 
     * @param statusMunicipio the value of field 'statusMunicipio'.
     */
    public void setStatusMunicipio(java.lang.String statusMunicipio)
    {
        this._statusMunicipio = statusMunicipio;
    } //-- void setStatusMunicipio(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaConsultarMunicipioUf
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.response.ListaConsultarMunicipioUf unmarshal(java.io.Reader) 

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

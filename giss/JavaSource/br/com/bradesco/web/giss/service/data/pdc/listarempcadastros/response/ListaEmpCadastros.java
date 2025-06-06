/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response;

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
 * Class ListaEmpCadastros.
 * 
 * @version $Revision$ $Date$
 */
public class ListaEmpCadastros implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _cnpjPrincipal
     */
    private long _cnpjPrincipal = 0;

    /**
     * keeps track of state for field: _cnpjPrincipal
     */
    private boolean _has_cnpjPrincipal;

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
     * Field _nomeEmpresa
     */
    private java.lang.String _nomeEmpresa;

    /**
     * Field _sistContabil
     */
    private java.lang.String _sistContabil;

    /**
     * Field _percentual
     */
    private java.math.BigDecimal _percentual = new java.math.BigDecimal("0");

    /**
     * Field _contaDespesa
     */
    private long _contaDespesa = 0;

    /**
     * keeps track of state for field: _contaDespesa
     */
    private boolean _has_contaDespesa;

    /**
     * Field _contaProvisao
     */
    private long _contaProvisao = 0;

    /**
     * keeps track of state for field: _contaProvisao
     */
    private boolean _has_contaProvisao;

    /**
     * Field _identContribuinte
     */
    private int _identContribuinte = 0;

    /**
     * keeps track of state for field: _identContribuinte
     */
    private boolean _has_identContribuinte;

    /**
     * Field _residInformacoes
     */
    private java.lang.String _residInformacoes;

    /**
     * Field _telResponsavel
     */
    private long _telResponsavel = 0;

    /**
     * keeps track of state for field: _telResponsavel
     */
    private boolean _has_telResponsavel;

    /**
     * Field _emailResponsavel
     */
    private java.lang.String _emailResponsavel;

    /**
     * Field _logradouro
     */
    private java.lang.String _logradouro;

    /**
     * Field _numeroLogradouro
     */
    private java.lang.String _numeroLogradouro;

    /**
     * Field _complEndereco
     */
    private java.lang.String _complEndereco;

    /**
     * Field _bairro
     */
    private java.lang.String _bairro;

    /**
     * Field _cep
     */
    private int _cep = 0;

    /**
     * keeps track of state for field: _cep
     */
    private boolean _has_cep;

    /**
     * Field _complCep
     */
    private int _complCep = 0;

    /**
     * keeps track of state for field: _complCep
     */
    private boolean _has_complCep;

    /**
     * Field _municipio
     */
    private long _municipio = 0;

    /**
     * keeps track of state for field: _municipio
     */
    private boolean _has_municipio;

    /**
     * Field _estado
     */
    private int _estado = 0;

    /**
     * keeps track of state for field: _estado
     */
    private boolean _has_estado;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaEmpCadastros() 
     {
        super();
        setPercentual(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCep
     * 
     */
    public void deleteCep()
    {
        this._has_cep= false;
    } //-- void deleteCep() 

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
     * Method deleteCnpjPrincipal
     * 
     */
    public void deleteCnpjPrincipal()
    {
        this._has_cnpjPrincipal= false;
    } //-- void deleteCnpjPrincipal() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteComplCep
     * 
     */
    public void deleteComplCep()
    {
        this._has_complCep= false;
    } //-- void deleteComplCep() 

    /**
     * Method deleteContaDespesa
     * 
     */
    public void deleteContaDespesa()
    {
        this._has_contaDespesa= false;
    } //-- void deleteContaDespesa() 

    /**
     * Method deleteContaProvisao
     * 
     */
    public void deleteContaProvisao()
    {
        this._has_contaProvisao= false;
    } //-- void deleteContaProvisao() 

    /**
     * Method deleteEstado
     * 
     */
    public void deleteEstado()
    {
        this._has_estado= false;
    } //-- void deleteEstado() 

    /**
     * Method deleteIdentContribuinte
     * 
     */
    public void deleteIdentContribuinte()
    {
        this._has_identContribuinte= false;
    } //-- void deleteIdentContribuinte() 

    /**
     * Method deleteMunicipio
     * 
     */
    public void deleteMunicipio()
    {
        this._has_municipio= false;
    } //-- void deleteMunicipio() 

    /**
     * Method deleteTelResponsavel
     * 
     */
    public void deleteTelResponsavel()
    {
        this._has_telResponsavel= false;
    } //-- void deleteTelResponsavel() 

    /**
     * Returns the value of field 'bairro'.
     * 
     * @return String
     * @return the value of field 'bairro'.
     */
    public java.lang.String getBairro()
    {
        return this._bairro;
    } //-- java.lang.String getBairro() 

    /**
     * Returns the value of field 'cep'.
     * 
     * @return int
     * @return the value of field 'cep'.
     */
    public int getCep()
    {
        return this._cep;
    } //-- int getCep() 

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
     * Returns the value of field 'cnpjPrincipal'.
     * 
     * @return long
     * @return the value of field 'cnpjPrincipal'.
     */
    public long getCnpjPrincipal()
    {
        return this._cnpjPrincipal;
    } //-- long getCnpjPrincipal() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'complCep'.
     * 
     * @return int
     * @return the value of field 'complCep'.
     */
    public int getComplCep()
    {
        return this._complCep;
    } //-- int getComplCep() 

    /**
     * Returns the value of field 'complEndereco'.
     * 
     * @return String
     * @return the value of field 'complEndereco'.
     */
    public java.lang.String getComplEndereco()
    {
        return this._complEndereco;
    } //-- java.lang.String getComplEndereco() 

    /**
     * Returns the value of field 'contaDespesa'.
     * 
     * @return long
     * @return the value of field 'contaDespesa'.
     */
    public long getContaDespesa()
    {
        return this._contaDespesa;
    } //-- long getContaDespesa() 

    /**
     * Returns the value of field 'contaProvisao'.
     * 
     * @return long
     * @return the value of field 'contaProvisao'.
     */
    public long getContaProvisao()
    {
        return this._contaProvisao;
    } //-- long getContaProvisao() 

    /**
     * Returns the value of field 'emailResponsavel'.
     * 
     * @return String
     * @return the value of field 'emailResponsavel'.
     */
    public java.lang.String getEmailResponsavel()
    {
        return this._emailResponsavel;
    } //-- java.lang.String getEmailResponsavel() 

    /**
     * Returns the value of field 'estado'.
     * 
     * @return int
     * @return the value of field 'estado'.
     */
    public int getEstado()
    {
        return this._estado;
    } //-- int getEstado() 

    /**
     * Returns the value of field 'identContribuinte'.
     * 
     * @return int
     * @return the value of field 'identContribuinte'.
     */
    public int getIdentContribuinte()
    {
        return this._identContribuinte;
    } //-- int getIdentContribuinte() 

    /**
     * Returns the value of field 'logradouro'.
     * 
     * @return String
     * @return the value of field 'logradouro'.
     */
    public java.lang.String getLogradouro()
    {
        return this._logradouro;
    } //-- java.lang.String getLogradouro() 

    /**
     * Returns the value of field 'municipio'.
     * 
     * @return long
     * @return the value of field 'municipio'.
     */
    public long getMunicipio()
    {
        return this._municipio;
    } //-- long getMunicipio() 

    /**
     * Returns the value of field 'nomeEmpresa'.
     * 
     * @return String
     * @return the value of field 'nomeEmpresa'.
     */
    public java.lang.String getNomeEmpresa()
    {
        return this._nomeEmpresa;
    } //-- java.lang.String getNomeEmpresa() 

    /**
     * Returns the value of field 'numeroLogradouro'.
     * 
     * @return String
     * @return the value of field 'numeroLogradouro'.
     */
    public java.lang.String getNumeroLogradouro()
    {
        return this._numeroLogradouro;
    } //-- java.lang.String getNumeroLogradouro() 

    /**
     * Returns the value of field 'percentual'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentual'.
     */
    public java.math.BigDecimal getPercentual()
    {
        return this._percentual;
    } //-- java.math.BigDecimal getPercentual() 

    /**
     * Returns the value of field 'residInformacoes'.
     * 
     * @return String
     * @return the value of field 'residInformacoes'.
     */
    public java.lang.String getResidInformacoes()
    {
        return this._residInformacoes;
    } //-- java.lang.String getResidInformacoes() 

    /**
     * Returns the value of field 'sistContabil'.
     * 
     * @return String
     * @return the value of field 'sistContabil'.
     */
    public java.lang.String getSistContabil()
    {
        return this._sistContabil;
    } //-- java.lang.String getSistContabil() 

    /**
     * Returns the value of field 'telResponsavel'.
     * 
     * @return long
     * @return the value of field 'telResponsavel'.
     */
    public long getTelResponsavel()
    {
        return this._telResponsavel;
    } //-- long getTelResponsavel() 

    /**
     * Method hasCep
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCep()
    {
        return this._has_cep;
    } //-- boolean hasCep() 

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
     * Method hasCnpjPrincipal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjPrincipal()
    {
        return this._has_cnpjPrincipal;
    } //-- boolean hasCnpjPrincipal() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasComplCep
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasComplCep()
    {
        return this._has_complCep;
    } //-- boolean hasComplCep() 

    /**
     * Method hasContaDespesa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaDespesa()
    {
        return this._has_contaDespesa;
    } //-- boolean hasContaDespesa() 

    /**
     * Method hasContaProvisao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaProvisao()
    {
        return this._has_contaProvisao;
    } //-- boolean hasContaProvisao() 

    /**
     * Method hasEstado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasEstado()
    {
        return this._has_estado;
    } //-- boolean hasEstado() 

    /**
     * Method hasIdentContribuinte
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIdentContribuinte()
    {
        return this._has_identContribuinte;
    } //-- boolean hasIdentContribuinte() 

    /**
     * Method hasMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMunicipio()
    {
        return this._has_municipio;
    } //-- boolean hasMunicipio() 

    /**
     * Method hasTelResponsavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTelResponsavel()
    {
        return this._has_telResponsavel;
    } //-- boolean hasTelResponsavel() 

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
     * Sets the value of field 'bairro'.
     * 
     * @param bairro the value of field 'bairro'.
     */
    public void setBairro(java.lang.String bairro)
    {
        this._bairro = bairro;
    } //-- void setBairro(java.lang.String) 

    /**
     * Sets the value of field 'cep'.
     * 
     * @param cep the value of field 'cep'.
     */
    public void setCep(int cep)
    {
        this._cep = cep;
        this._has_cep = true;
    } //-- void setCep(int) 

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
     * Sets the value of field 'cnpjPrincipal'.
     * 
     * @param cnpjPrincipal the value of field 'cnpjPrincipal'.
     */
    public void setCnpjPrincipal(long cnpjPrincipal)
    {
        this._cnpjPrincipal = cnpjPrincipal;
        this._has_cnpjPrincipal = true;
    } //-- void setCnpjPrincipal(long) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'complCep'.
     * 
     * @param complCep the value of field 'complCep'.
     */
    public void setComplCep(int complCep)
    {
        this._complCep = complCep;
        this._has_complCep = true;
    } //-- void setComplCep(int) 

    /**
     * Sets the value of field 'complEndereco'.
     * 
     * @param complEndereco the value of field 'complEndereco'.
     */
    public void setComplEndereco(java.lang.String complEndereco)
    {
        this._complEndereco = complEndereco;
    } //-- void setComplEndereco(java.lang.String) 

    /**
     * Sets the value of field 'contaDespesa'.
     * 
     * @param contaDespesa the value of field 'contaDespesa'.
     */
    public void setContaDespesa(long contaDespesa)
    {
        this._contaDespesa = contaDespesa;
        this._has_contaDespesa = true;
    } //-- void setContaDespesa(long) 

    /**
     * Sets the value of field 'contaProvisao'.
     * 
     * @param contaProvisao the value of field 'contaProvisao'.
     */
    public void setContaProvisao(long contaProvisao)
    {
        this._contaProvisao = contaProvisao;
        this._has_contaProvisao = true;
    } //-- void setContaProvisao(long) 

    /**
     * Sets the value of field 'emailResponsavel'.
     * 
     * @param emailResponsavel the value of field 'emailResponsavel'
     */
    public void setEmailResponsavel(java.lang.String emailResponsavel)
    {
        this._emailResponsavel = emailResponsavel;
    } //-- void setEmailResponsavel(java.lang.String) 

    /**
     * Sets the value of field 'estado'.
     * 
     * @param estado the value of field 'estado'.
     */
    public void setEstado(int estado)
    {
        this._estado = estado;
        this._has_estado = true;
    } //-- void setEstado(int) 

    /**
     * Sets the value of field 'identContribuinte'.
     * 
     * @param identContribuinte the value of field
     * 'identContribuinte'.
     */
    public void setIdentContribuinte(int identContribuinte)
    {
        this._identContribuinte = identContribuinte;
        this._has_identContribuinte = true;
    } //-- void setIdentContribuinte(int) 

    /**
     * Sets the value of field 'logradouro'.
     * 
     * @param logradouro the value of field 'logradouro'.
     */
    public void setLogradouro(java.lang.String logradouro)
    {
        this._logradouro = logradouro;
    } //-- void setLogradouro(java.lang.String) 

    /**
     * Sets the value of field 'municipio'.
     * 
     * @param municipio the value of field 'municipio'.
     */
    public void setMunicipio(long municipio)
    {
        this._municipio = municipio;
        this._has_municipio = true;
    } //-- void setMunicipio(long) 

    /**
     * Sets the value of field 'nomeEmpresa'.
     * 
     * @param nomeEmpresa the value of field 'nomeEmpresa'.
     */
    public void setNomeEmpresa(java.lang.String nomeEmpresa)
    {
        this._nomeEmpresa = nomeEmpresa;
    } //-- void setNomeEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'numeroLogradouro'.
     * 
     * @param numeroLogradouro the value of field 'numeroLogradouro'
     */
    public void setNumeroLogradouro(java.lang.String numeroLogradouro)
    {
        this._numeroLogradouro = numeroLogradouro;
    } //-- void setNumeroLogradouro(java.lang.String) 

    /**
     * Sets the value of field 'percentual'.
     * 
     * @param percentual the value of field 'percentual'.
     */
    public void setPercentual(java.math.BigDecimal percentual)
    {
        this._percentual = percentual;
    } //-- void setPercentual(java.math.BigDecimal) 

    /**
     * Sets the value of field 'residInformacoes'.
     * 
     * @param residInformacoes the value of field 'residInformacoes'
     */
    public void setResidInformacoes(java.lang.String residInformacoes)
    {
        this._residInformacoes = residInformacoes;
    } //-- void setResidInformacoes(java.lang.String) 

    /**
     * Sets the value of field 'sistContabil'.
     * 
     * @param sistContabil the value of field 'sistContabil'.
     */
    public void setSistContabil(java.lang.String sistContabil)
    {
        this._sistContabil = sistContabil;
    } //-- void setSistContabil(java.lang.String) 

    /**
     * Sets the value of field 'telResponsavel'.
     * 
     * @param telResponsavel the value of field 'telResponsavel'.
     */
    public void setTelResponsavel(long telResponsavel)
    {
        this._telResponsavel = telResponsavel;
        this._has_telResponsavel = true;
    } //-- void setTelResponsavel(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaEmpCadastros
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.response.ListaEmpCadastros unmarshal(java.io.Reader) 

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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.2 2017/08/11 16:04:57 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/08/11 16:04:57 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequencialUnidadeOrganizacional
     */
    private int _numeroSequencialUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialUnidadeOrganizacional
     */
    private boolean _has_numeroSequencialUnidadeOrganizacional;

    /**
     * Field _codigoDependencia
     */
    private int _codigoDependencia = 0;

    /**
     * keeps track of state for field: _codigoDependencia
     */
    private boolean _has_codigoDependencia;

    /**
     * Field _nomeDependencia
     */
    private java.lang.String _nomeDependencia;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _siglaUnidadeFederativa
     */
    private java.lang.String _siglaUnidadeFederativa;

    /**
     * Field _dataExclusao
     */
    private java.lang.String _dataExclusao;

    /**
     * Field _horaManutencao
     */
    private java.lang.String _horaManutencao;

    /**
     * Field _codigoDependenciaIncorporadora
     */
    private int _codigoDependenciaIncorporadora = 0;

    /**
     * keeps track of state for field:
     * _codigoDependenciaIncorporadora
     */
    private boolean _has_codigoDependenciaIncorporadora;

    /**
     * Field _nomeDependenciaIncorporadora
     */
    private java.lang.String _nomeDependenciaIncorporadora;

    /**
     * Field _dataBaixa
     */
    private java.lang.String _dataBaixa;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoDependencia
     * 
     */
    public void deleteCodigoDependencia()
    {
        this._has_codigoDependencia= false;
    } //-- void deleteCodigoDependencia() 

    /**
     * Method deleteCodigoDependenciaIncorporadora
     * 
     */
    public void deleteCodigoDependenciaIncorporadora()
    {
        this._has_codigoDependenciaIncorporadora= false;
    } //-- void deleteCodigoDependenciaIncorporadora() 

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
     * Method deleteNumeroSequencialUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequencialUnidadeOrganizacional()
    {
        this._has_numeroSequencialUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequencialUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return int
     * @return the value of field 'codigoDependencia'.
     */
    public int getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- int getCodigoDependencia() 

    /**
     * Returns the value of field 'codigoDependenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'codigoDependenciaIncorporadora'.
     */
    public int getCodigoDependenciaIncorporadora()
    {
        return this._codigoDependenciaIncorporadora;
    } //-- int getCodigoDependenciaIncorporadora() 

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
     * Returns the value of field 'dataBaixa'.
     * 
     * @return String
     * @return the value of field 'dataBaixa'.
     */
    public java.lang.String getDataBaixa()
    {
        return this._dataBaixa;
    } //-- java.lang.String getDataBaixa() 

    /**
     * Returns the value of field 'dataExclusao'.
     * 
     * @return String
     * @return the value of field 'dataExclusao'.
     */
    public java.lang.String getDataExclusao()
    {
        return this._dataExclusao;
    } //-- java.lang.String getDataExclusao() 

    /**
     * Returns the value of field 'horaManutencao'.
     * 
     * @return String
     * @return the value of field 'horaManutencao'.
     */
    public java.lang.String getHoraManutencao()
    {
        return this._horaManutencao;
    } //-- java.lang.String getHoraManutencao() 

    /**
     * Returns the value of field 'nomeDependencia'.
     * 
     * @return String
     * @return the value of field 'nomeDependencia'.
     */
    public java.lang.String getNomeDependencia()
    {
        return this._nomeDependencia;
    } //-- java.lang.String getNomeDependencia() 

    /**
     * Returns the value of field 'nomeDependenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'nomeDependenciaIncorporadora'.
     */
    public java.lang.String getNomeDependenciaIncorporadora()
    {
        return this._nomeDependenciaIncorporadora;
    } //-- java.lang.String getNomeDependenciaIncorporadora() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

    /**
     * Returns the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     */
    public int getNumeroSequencialUnidadeOrganizacional()
    {
        return this._numeroSequencialUnidadeOrganizacional;
    } //-- int getNumeroSequencialUnidadeOrganizacional() 

    /**
     * Returns the value of field 'siglaUnidadeFederativa'.
     * 
     * @return String
     * @return the value of field 'siglaUnidadeFederativa'.
     */
    public java.lang.String getSiglaUnidadeFederativa()
    {
        return this._siglaUnidadeFederativa;
    } //-- java.lang.String getSiglaUnidadeFederativa() 

    /**
     * Method hasCodigoDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependencia()
    {
        return this._has_codigoDependencia;
    } //-- boolean hasCodigoDependencia() 

    /**
     * Method hasCodigoDependenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependenciaIncorporadora()
    {
        return this._has_codigoDependenciaIncorporadora;
    } //-- boolean hasCodigoDependenciaIncorporadora() 

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
     * Method hasNumeroSequencialUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialUnidadeOrganizacional()
    {
        return this._has_numeroSequencialUnidadeOrganizacional;
    } //-- boolean hasNumeroSequencialUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(int codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
        this._has_codigoDependencia = true;
    } //-- void setCodigoDependencia(int) 

    /**
     * Sets the value of field 'codigoDependenciaIncorporadora'.
     * 
     * @param codigoDependenciaIncorporadora the value of field
     * 'codigoDependenciaIncorporadora'.
     */
    public void setCodigoDependenciaIncorporadora(int codigoDependenciaIncorporadora)
    {
        this._codigoDependenciaIncorporadora = codigoDependenciaIncorporadora;
        this._has_codigoDependenciaIncorporadora = true;
    } //-- void setCodigoDependenciaIncorporadora(int) 

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
     * Sets the value of field 'dataBaixa'.
     * 
     * @param dataBaixa the value of field 'dataBaixa'.
     */
    public void setDataBaixa(java.lang.String dataBaixa)
    {
        this._dataBaixa = dataBaixa;
    } //-- void setDataBaixa(java.lang.String) 

    /**
     * Sets the value of field 'dataExclusao'.
     * 
     * @param dataExclusao the value of field 'dataExclusao'.
     */
    public void setDataExclusao(java.lang.String dataExclusao)
    {
        this._dataExclusao = dataExclusao;
    } //-- void setDataExclusao(java.lang.String) 

    /**
     * Sets the value of field 'horaManutencao'.
     * 
     * @param horaManutencao the value of field 'horaManutencao'.
     */
    public void setHoraManutencao(java.lang.String horaManutencao)
    {
        this._horaManutencao = horaManutencao;
    } //-- void setHoraManutencao(java.lang.String) 

    /**
     * Sets the value of field 'nomeDependencia'.
     * 
     * @param nomeDependencia the value of field 'nomeDependencia'.
     */
    public void setNomeDependencia(java.lang.String nomeDependencia)
    {
        this._nomeDependencia = nomeDependencia;
    } //-- void setNomeDependencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeDependenciaIncorporadora'.
     * 
     * @param nomeDependenciaIncorporadora the value of field
     * 'nomeDependenciaIncorporadora'.
     */
    public void setNomeDependenciaIncorporadora(java.lang.String nomeDependenciaIncorporadora)
    {
        this._nomeDependenciaIncorporadora = nomeDependenciaIncorporadora;
    } //-- void setNomeDependenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @param numeroSequencialUnidadeOrganizacional the value of
     * field 'numeroSequencialUnidadeOrganizacional'.
     */
    public void setNumeroSequencialUnidadeOrganizacional(int numeroSequencialUnidadeOrganizacional)
    {
        this._numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
        this._has_numeroSequencialUnidadeOrganizacional = true;
    } //-- void setNumeroSequencialUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'siglaUnidadeFederativa'.
     * 
     * @param siglaUnidadeFederativa the value of field
     * 'siglaUnidadeFederativa'.
     */
    public void setSiglaUnidadeFederativa(java.lang.String siglaUnidadeFederativa)
    {
        this._siglaUnidadeFederativa = siglaUnidadeFederativa;
    } //-- void setSiglaUnidadeFederativa(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.response.Ocorrencias unmarshal(java.io.Reader) 

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

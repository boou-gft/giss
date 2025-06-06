/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response;

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
 * Class OcorDependenciaApuracaoMensal.
 * 
 * @version $Revision$ $Date$
 */
public class OcorDependenciaApuracaoMensal implements java.io.Serializable {


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
     * Field _numeroSequenciaUnidadeOrganizacional
     */
    private int _numeroSequenciaUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequenciaUnidadeOrganizacional
     */
    private boolean _has_numeroSequenciaUnidadeOrganizacional;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codigoDependencia
     */
    private java.lang.String _codigoDependencia;

    /**
     * Field _descricaoDependencia
     */
    private java.lang.String _descricaoDependencia;

    /**
     * Field _codPa
     */
    private java.lang.String _codPa;

    /**
     * Field _descPa
     */
    private java.lang.String _descPa;

    /**
     * Field _municipioReceitaSinal
     */
    private java.lang.String _municipioReceitaSinal;

    /**
     * Field _municipioReceitaValor
     */
    private double _municipioReceitaValor = 0;

    /**
     * keeps track of state for field: _municipioReceitaValor
     */
    private boolean _has_municipioReceitaValor;

    /**
     * Field _geralReceitaSinal
     */
    private java.lang.String _geralReceitaSinal;

    /**
     * Field _geralReceitaValor
     */
    private double _geralReceitaValor = 0;

    /**
     * keeps track of state for field: _geralReceitaValor
     */
    private boolean _has_geralReceitaValor;

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
     * Field _cdUF
     */
    private java.lang.String _cdUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _tragSemTrag
     */
    private java.lang.String _tragSemTrag;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorDependenciaApuracaoMensal() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal()


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
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteGeralReceitaValor
     * 
     */
    public void deleteGeralReceitaValor()
    {
        this._has_geralReceitaValor= false;
    } //-- void deleteGeralReceitaValor() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteMunicipioReceitaValor
     * 
     */
    public void deleteMunicipioReceitaValor()
    {
        this._has_municipioReceitaValor= false;
    } //-- void deleteMunicipioReceitaValor() 

    /**
     * Method deleteNumeroSequenciaUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequenciaUnidadeOrganizacional()
    {
        this._has_numeroSequenciaUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Returns the value of field 'cdUF'.
     * 
     * @return String
     * @return the value of field 'cdUF'.
     */
    public java.lang.String getCdUF()
    {
        return this._cdUF;
    } //-- java.lang.String getCdUF() 

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
     * Returns the value of field 'codPa'.
     * 
     * @return String
     * @return the value of field 'codPa'.
     */
    public java.lang.String getCodPa()
    {
        return this._codPa;
    } //-- java.lang.String getCodPa() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return String
     * @return the value of field 'codigoDependencia'.
     */
    public java.lang.String getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- java.lang.String getCodigoDependencia() 

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
     * Returns the value of field 'descPa'.
     * 
     * @return String
     * @return the value of field 'descPa'.
     */
    public java.lang.String getDescPa()
    {
        return this._descPa;
    } //-- java.lang.String getDescPa() 

    /**
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

    /**
     * Returns the value of field 'descricaoDependencia'.
     * 
     * @return String
     * @return the value of field 'descricaoDependencia'.
     */
    public java.lang.String getDescricaoDependencia()
    {
        return this._descricaoDependencia;
    } //-- java.lang.String getDescricaoDependencia() 

    /**
     * Returns the value of field 'geralReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'geralReceitaSinal'.
     */
    public java.lang.String getGeralReceitaSinal()
    {
        return this._geralReceitaSinal;
    } //-- java.lang.String getGeralReceitaSinal() 

    /**
     * Returns the value of field 'geralReceitaValor'.
     * 
     * @return double
     * @return the value of field 'geralReceitaValor'.
     */
    public double getGeralReceitaValor()
    {
        return this._geralReceitaValor;
    } //-- double getGeralReceitaValor() 

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
     * Returns the value of field 'municipioReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'municipioReceitaSinal'.
     */
    public java.lang.String getMunicipioReceitaSinal()
    {
        return this._municipioReceitaSinal;
    } //-- java.lang.String getMunicipioReceitaSinal() 

    /**
     * Returns the value of field 'municipioReceitaValor'.
     * 
     * @return double
     * @return the value of field 'municipioReceitaValor'.
     */
    public double getMunicipioReceitaValor()
    {
        return this._municipioReceitaValor;
    } //-- double getMunicipioReceitaValor() 

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
     * Returns the value of field 'tragSemTrag'.
     * 
     * @return String
     * @return the value of field 'tragSemTrag'.
     */
    public java.lang.String getTragSemTrag()
    {
        return this._tragSemTrag;
    } //-- java.lang.String getTragSemTrag() 

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
     * Method hasGeralReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGeralReceitaValor()
    {
        return this._has_geralReceitaValor;
    } //-- boolean hasGeralReceitaValor() 

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
     * Method hasMunicipioReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMunicipioReceitaValor()
    {
        return this._has_municipioReceitaValor;
    } //-- boolean hasMunicipioReceitaValor() 

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
     * Sets the value of field 'cdUF'.
     * 
     * @param cdUF the value of field 'cdUF'.
     */
    public void setCdUF(java.lang.String cdUF)
    {
        this._cdUF = cdUF;
    } //-- void setCdUF(java.lang.String) 

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
     * Sets the value of field 'codPa'.
     * 
     * @param codPa the value of field 'codPa'.
     */
    public void setCodPa(java.lang.String codPa)
    {
        this._codPa = codPa;
    } //-- void setCodPa(java.lang.String) 

    /**
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(java.lang.String codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
    } //-- void setCodigoDependencia(java.lang.String) 

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
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descPa'.
     * 
     * @param descPa the value of field 'descPa'.
     */
    public void setDescPa(java.lang.String descPa)
    {
        this._descPa = descPa;
    } //-- void setDescPa(java.lang.String) 

    /**
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

    /**
     * Sets the value of field 'descricaoDependencia'.
     * 
     * @param descricaoDependencia the value of field
     * 'descricaoDependencia'.
     */
    public void setDescricaoDependencia(java.lang.String descricaoDependencia)
    {
        this._descricaoDependencia = descricaoDependencia;
    } //-- void setDescricaoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'geralReceitaSinal'.
     * 
     * @param geralReceitaSinal the value of field
     * 'geralReceitaSinal'.
     */
    public void setGeralReceitaSinal(java.lang.String geralReceitaSinal)
    {
        this._geralReceitaSinal = geralReceitaSinal;
    } //-- void setGeralReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'geralReceitaValor'.
     * 
     * @param geralReceitaValor the value of field
     * 'geralReceitaValor'.
     */
    public void setGeralReceitaValor(double geralReceitaValor)
    {
        this._geralReceitaValor = geralReceitaValor;
        this._has_geralReceitaValor = true;
    } //-- void setGeralReceitaValor(double) 

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
     * Sets the value of field 'municipioReceitaSinal'.
     * 
     * @param municipioReceitaSinal the value of field
     * 'municipioReceitaSinal'.
     */
    public void setMunicipioReceitaSinal(java.lang.String municipioReceitaSinal)
    {
        this._municipioReceitaSinal = municipioReceitaSinal;
    } //-- void setMunicipioReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'municipioReceitaValor'.
     * 
     * @param municipioReceitaValor the value of field
     * 'municipioReceitaValor'.
     */
    public void setMunicipioReceitaValor(double municipioReceitaValor)
    {
        this._municipioReceitaValor = municipioReceitaValor;
        this._has_municipioReceitaValor = true;
    } //-- void setMunicipioReceitaValor(double) 

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
     * Sets the value of field 'tragSemTrag'.
     * 
     * @param tragSemTrag the value of field 'tragSemTrag'.
     */
    public void setTragSemTrag(java.lang.String tragSemTrag)
    {
        this._tragSemTrag = tragSemTrag;
    } //-- void setTragSemTrag(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorDependenciaApuracaoMensal
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal unmarshal(java.io.Reader) 

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

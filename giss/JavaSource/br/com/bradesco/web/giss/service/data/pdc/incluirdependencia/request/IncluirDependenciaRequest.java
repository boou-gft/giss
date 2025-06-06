/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirDependenciaRequest.java,v 1.1 2017/04/11 14:10:54 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request;

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
 * Class IncluirDependenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:54 $
 */
public class IncluirDependenciaRequest implements java.io.Serializable {


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
     * Field _indicadorUnidadeTributaria
     */
    private int _indicadorUnidadeTributaria = 0;

    /**
     * keeps track of state for field: _indicadorUnidadeTributaria
     */
    private boolean _has_indicadorUnidadeTributaria;

    /**
     * Field _codigoCCM
     */
    private long _codigoCCM = 0;

    /**
     * keeps track of state for field: _codigoCCM
     */
    private boolean _has_codigoCCM;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoPessoaIncorporadoraDepartamanto
     */
    private long _codigoPessoaIncorporadoraDepartamanto = 0;

    /**
     * keeps track of state for field:
     * _codigoPessoaIncorporadoraDepartamanto
     */
    private boolean _has_codigoPessoaIncorporadoraDepartamanto;

    /**
     * Field _numeroSequencialIncorporDepartamento
     */
    private int _numeroSequencialIncorporDepartamento = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialIncorporDepartamento
     */
    private boolean _has_numeroSequencialIncorporDepartamento;

    /**
     * Field _inscricaoMunicipal
     */
    private java.lang.String _inscricaoMunicipal;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirDependenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoCCM
     * 
     */
    public void deleteCodigoCCM()
    {
        this._has_codigoCCM= false;
    } //-- void deleteCodigoCCM() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaIncorporadoraDepartamanto
     * 
     */
    public void deleteCodigoPessoaIncorporadoraDepartamanto()
    {
        this._has_codigoPessoaIncorporadoraDepartamanto= false;
    } //-- void deleteCodigoPessoaIncorporadoraDepartamanto() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteIndicadorUnidadeTributaria
     * 
     */
    public void deleteIndicadorUnidadeTributaria()
    {
        this._has_indicadorUnidadeTributaria= false;
    } //-- void deleteIndicadorUnidadeTributaria() 

    /**
     * Method deleteNumeroSequencialIncorporDepartamento
     * 
     */
    public void deleteNumeroSequencialIncorporDepartamento()
    {
        this._has_numeroSequencialIncorporDepartamento= false;
    } //-- void deleteNumeroSequencialIncorporDepartamento() 

    /**
     * Method deleteNumeroSequencialUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequencialUnidadeOrganizacional()
    {
        this._has_numeroSequencialUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequencialUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoCCM'.
     * 
     * @return long
     * @return the value of field 'codigoCCM'.
     */
    public long getCodigoCCM()
    {
        return this._codigoCCM;
    } //-- long getCodigoCCM() 

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
     * Returns the value of field
     * 'codigoPessoaIncorporadoraDepartamanto'.
     * 
     * @return long
     * @return the value of field
     * 'codigoPessoaIncorporadoraDepartamanto'.
     */
    public long getCodigoPessoaIncorporadoraDepartamanto()
    {
        return this._codigoPessoaIncorporadoraDepartamanto;
    } //-- long getCodigoPessoaIncorporadoraDepartamanto() 

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
     * Returns the value of field 'indicadorUnidadeTributaria'.
     * 
     * @return int
     * @return the value of field 'indicadorUnidadeTributaria'.
     */
    public int getIndicadorUnidadeTributaria()
    {
        return this._indicadorUnidadeTributaria;
    } //-- int getIndicadorUnidadeTributaria() 

    /**
     * Returns the value of field 'inscricaoMunicipal'.
     * 
     * @return String
     * @return the value of field 'inscricaoMunicipal'.
     */
    public java.lang.String getInscricaoMunicipal()
    {
        return this._inscricaoMunicipal;
    } //-- java.lang.String getInscricaoMunicipal() 

    /**
     * Returns the value of field
     * 'numeroSequencialIncorporDepartamento'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialIncorporDepartamento'.
     */
    public int getNumeroSequencialIncorporDepartamento()
    {
        return this._numeroSequencialIncorporDepartamento;
    } //-- int getNumeroSequencialIncorporDepartamento() 

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
     * Method hasCodigoCCM
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCCM()
    {
        return this._has_codigoCCM;
    } //-- boolean hasCodigoCCM() 

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
     * Method hasCodigoPessoaIncorporadoraDepartamanto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaIncorporadoraDepartamanto()
    {
        return this._has_codigoPessoaIncorporadoraDepartamanto;
    } //-- boolean hasCodigoPessoaIncorporadoraDepartamanto() 

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
     * Method hasIndicadorUnidadeTributaria
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorUnidadeTributaria()
    {
        return this._has_indicadorUnidadeTributaria;
    } //-- boolean hasIndicadorUnidadeTributaria() 

    /**
     * Method hasNumeroSequencialIncorporDepartamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialIncorporDepartamento()
    {
        return this._has_numeroSequencialIncorporDepartamento;
    } //-- boolean hasNumeroSequencialIncorporDepartamento() 

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
     * Sets the value of field 'codigoCCM'.
     * 
     * @param codigoCCM the value of field 'codigoCCM'.
     */
    public void setCodigoCCM(long codigoCCM)
    {
        this._codigoCCM = codigoCCM;
        this._has_codigoCCM = true;
    } //-- void setCodigoCCM(long) 

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
     * Sets the value of field
     * 'codigoPessoaIncorporadoraDepartamanto'.
     * 
     * @param codigoPessoaIncorporadoraDepartamanto the value of
     * field 'codigoPessoaIncorporadoraDepartamanto'.
     */
    public void setCodigoPessoaIncorporadoraDepartamanto(long codigoPessoaIncorporadoraDepartamanto)
    {
        this._codigoPessoaIncorporadoraDepartamanto = codigoPessoaIncorporadoraDepartamanto;
        this._has_codigoPessoaIncorporadoraDepartamanto = true;
    } //-- void setCodigoPessoaIncorporadoraDepartamanto(long) 

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
     * Sets the value of field 'indicadorUnidadeTributaria'.
     * 
     * @param indicadorUnidadeTributaria the value of field
     * 'indicadorUnidadeTributaria'.
     */
    public void setIndicadorUnidadeTributaria(int indicadorUnidadeTributaria)
    {
        this._indicadorUnidadeTributaria = indicadorUnidadeTributaria;
        this._has_indicadorUnidadeTributaria = true;
    } //-- void setIndicadorUnidadeTributaria(int) 

    /**
     * Sets the value of field 'inscricaoMunicipal'.
     * 
     * @param inscricaoMunicipal the value of field
     * 'inscricaoMunicipal'.
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal)
    {
        this._inscricaoMunicipal = inscricaoMunicipal;
    } //-- void setInscricaoMunicipal(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequencialIncorporDepartamento'.
     * 
     * @param numeroSequencialIncorporDepartamento the value of
     * field 'numeroSequencialIncorporDepartamento'.
     */
    public void setNumeroSequencialIncorporDepartamento(int numeroSequencialIncorporDepartamento)
    {
        this._numeroSequencialIncorporDepartamento = numeroSequencialIncorporDepartamento;
        this._has_numeroSequencialIncorporDepartamento = true;
    } //-- void setNumeroSequencialIncorporDepartamento(int) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.request.IncluirDependenciaRequest unmarshal(java.io.Reader) 

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

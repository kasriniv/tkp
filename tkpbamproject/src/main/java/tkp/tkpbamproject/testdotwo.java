package tkp.tkpbamproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "tkptestdo")
public class testdotwo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TESTDOTWO_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "TESTDOTWO_ID_GENERATOR", sequenceName = "TESTDOTWO_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String col1;

   private java.lang.String col2;

   public testdotwo()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getCol1()
   {
      return this.col1;
   }

   public void setCol1(java.lang.String col1)
   {
      this.col1 = col1;
   }

   public java.lang.String getCol2()
   {
      return this.col2;
   }

   public void setCol2(java.lang.String col2)
   {
      this.col2 = col2;
   }

   public testdotwo(java.lang.Long id, java.lang.String col1, java.lang.String col2)
   {
      this.id = id;
      this.col1 = col1;
      this.col2 = col2;
   }

}